package java0924;

public class MyStack1 {
    final static int MAX_STACK_SIZE = 5;
    public static int[] stack = new int[MAX_STACK_SIZE];
    public static int top = -1;

    public static boolean isFull() {
        boolean result = (top >=( MAX_STACK_SIZE - 1));
        if(result) {
            System.out.println("The Stack is FULL!!!");
        }
        return result;
    }

    public static boolean isEmpty() {
        boolean result = (top <= -1);
        if(result) {
            System.out.println("The Stack is EMPTY!!!");
        }
        return result;
    }

    public static void push(int theElement) {
        if (!isFull()) {
            stack[++top] = theElement;
        }
    }

    public static void pop() {
        if(!isEmpty()) {
            top--;
        }
    }

    public static int top() {
        if(!isEmpty()){
            return stack[top];
        } else {
            isEmpty();
            return -1; // 若空，回傳 -1
        }
    }

    public static void popall() {
        while (!isEmpty()) {
            System.out.println(stack[top--]);
        }
    }

    public static void main(String args[]) {

        // the following codes are used for test
        // please do not modify the following codes

        push(1);
        push(2);
        push(3);
        System.out.println(top());
        pop();
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        pop();
        popall();
        pop();
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