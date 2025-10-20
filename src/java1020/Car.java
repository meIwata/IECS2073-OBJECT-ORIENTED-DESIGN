package java1020;

public class Car {
    String make;
    String model;
    int year;

    // 有參數建構子
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // 無參數建構子
    public Car() {
        this("BMW", "M3", 2025);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}