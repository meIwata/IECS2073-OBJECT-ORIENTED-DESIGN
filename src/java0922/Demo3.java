package java0922;

public class Demo3 {
    public static void main(String[] args) {
        int num1 = 10;
        String greeting = "Hello"; // greeting是類別型態
//        String greeting2 = greeting.toUpperCase() + " FCU";
        String greeting2 = 10 + 20 + greeting.toUpperCase(); // 10跟20會先相加


        System.out.println(greeting.length()); // 是類別型態，可以使用類別的方法
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting2);
    }
}
