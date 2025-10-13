package java1013;

class Car {
    // 屬性
    String make;
    String model;
    int year;

    // 如果沒有寫建構子的話，Java預設會寫一個空建構子
    Car(){

    }

    // 方法
    void startEngine() {
        System.out.println("Engine started!");
    }
}

public class App {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.make); // null
        System.out.println(myCar.model); // null
        System.out.println(myCar.year); // 0

        System.out.println("-------------------");

        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        myCar.startEngine();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
    }
}
