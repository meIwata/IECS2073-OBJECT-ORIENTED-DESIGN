package java1001;

public class MyStack2 {

    final static int MAX_STACK_SIZE = 5;
    public int[] stack = new int[MAX_STACK_SIZE];
    public int top = -1;

    public boolean isFull() {
        boolean result = (top >= (MAX_STACK_SIZE - 1));
        if (result) {
            System.out.println("The Stack is FULL!!!");
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
        if (!isFull()) {
            stack[++top] = theElement;
        }
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