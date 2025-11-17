package java1117;

class Printer {
    public void print(String message) {
        System.out.println(message + "，我是Printer類別");
    }
}

public class Delegator {
    Printer printer = new Printer();

    public void print(String message) {
        printer.print(message + "，透過Delegator類別");
    }

    public static void main(String[] args) {
        Delegator delegator = new Delegator();
        delegator.print("Hello World");
    }
}
