package java1013;

class Car {
    // 屬性
    String make;
    String model;
    int year;

    static int count;

    // 如果沒有寫建構子的話，Java預設會寫一個空建構子
    Car() {

    }

    // 有參建構子
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        year = 2025; // 預設年份
    }

    // 有參建構子
    Car(String make, String model, int inputyear) { // 這裡的make, model, inputyear是區域變數
        this.make = make; // this.make指的是上面的 String make，區域變數assign給成員變數
        this.model = model;
        year = inputyear; // 因為區域變數跟成員變數不一樣，所以可以不用this
    }

    //  實體方法（Instance Method）
    void startEngine() {
        System.out.println("Engine started!");
    }
    static void greetUser(String name) {
        System.out.println("Hello, " + name.toUpperCase() + "!");
//        System.out.println(count + make); // 靜態方法只能存取靜態變數
    }


    // 靜態方法（Static Method）
    static void showCount() {
        System.out.println("Car count: " + count);
    }
}

public class App {
    public static void main(String[] args) {
        Car myCar = new Car("null", "Civic", 2020); // 使用有參建構子來建立物件

//        myCar.count = 10;
        Car.count = 10; // 靜態變數可以用類別名稱來存取
        myCar.startEngine(); // 呼叫實體方法
//        myCar.greetUser("John"); // 呼叫實體方法
        Car.greetUser("John"); // 呼叫靜態方法
        Car.showCount(); // 呼叫靜態方法


//        Car myCar2 = new Car(); //  如果已經自己設定好有參建構子，Java就不會再幫你做空參數建構子
//        Car myCar3 = new Car("BMW", "M3"); // 使用有參建構子來建立物件
//        System.out.println(myCar.make); // null
//        System.out.println(myCar.model); // null
//        System.out.println(myCar.year); // 0

//        System.out.println(myCar3.make);
//        System.out.println(myCar3.model);
//        System.out.println(myCar3.year);

//        System.out.println("-------------------");
//
//        myCar.make = "Toyota";
//        myCar.model = "Camry";
//        myCar.year = 2022;
//        myCar.startEngine();
//
//        System.out.println(myCar.make);
//        System.out.println(myCar.model);
//        System.out.println(myCar.year);
    }
}
