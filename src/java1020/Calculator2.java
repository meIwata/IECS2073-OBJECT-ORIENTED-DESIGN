package java1020;

public class Calculator2 {
    void increment(int num) {
        num++; // Increment the value
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b++;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
//        Calculator2 calc = new Calculator2();
//        int number = 5;
//        System.out.println("Before method call: " + number);
//        calc.increment(number);
//        System.out.println("After method call: " + number);
    }
}
