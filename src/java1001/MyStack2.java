package java1001;

public class MyStack2 {

    final static int DEFAULT_STACK_SIZE = 5;
    private int[] stack;
    private int top;
    private int size;

    public MyStack2() {
        stack = new int[DEFAULT_STACK_SIZE];
        top = -1;
        size = DEFAULT_STACK_SIZE;
    }

    public MyStack2(int _size) {
        stack = new int[_size];
        top = -1;
        size = _size;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        boolean result = (top >= (size - 1));
        if (result) {
            System.out.println("The Stack is FULL!!! Capacity of the stack is double!!!");
//            int[] temp = new int[size * 2];
//            for (int i = 0; i < size; i++) {
//                temp[i] = this.stack[i];
//            }
//            this.stack = temp;
//            size = size * 2;


            MyStack2 tempStack = new MyStack2(this.getSize());
            while (!this.isEmpty()) {
                tempStack.push(this.top());
                this.pop();
            }
            this.stack = new int[size * 2];
            this.size = size * 2;
            while (!tempStack.isEmpty()) {
                this.push(tempStack.top());
                tempStack.pop();
            }
        }
        return result;
    }

    public boolean isEmpty() {
        boolean result = (top <= -1);
        if (result) {
            System.out.println("The Stack is EMPTY!!!");
        }
        return result;
    }

    public void push(int theElement) {
        if(isFull())
            stack[++top] = theElement;
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    public int top() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            isEmpty();
            return -1; // 若空，回傳 -1
        }
    }

    public void popall() {
        while (!isEmpty()) {
            System.out.println(stack[top--]);
        }
    }

    public static void main(String args[]) {

        // the following codes are used for test
        // please do not modify the following codes

        MyStack2 myStack = new MyStack2();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        myStack.pop();

//        myStack.stack[0] = 10;
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.pop();
        myStack.popall();
        myStack.pop();
        // Final Output should be like:
        // 3
        // The Stack is FULL!!!
        // The Stack is FULL!!!
        // 5
        // 4
        // 2
        // 1
        // The Stack is EMPTY!!!
        // The Stack is EMPTY!!!
    }
}