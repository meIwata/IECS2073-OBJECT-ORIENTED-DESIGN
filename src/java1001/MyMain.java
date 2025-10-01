package java1001;

public class MyMain {
    public static void main(String[] args) {
        MyStack2 myStack = new MyStack2();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        myStack.pop();

//        myStack.stack[0]=10; // 不能存取MyStack2的
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.pop();
        myStack.popall();
        myStack.pop();
    }
}
