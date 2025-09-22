package java0922;

public class Demo1 {
    public static void main(String[] args) {
        short s = 10;
        long l = s; // 自動轉型

        double floatNum = 10.1;
        int num = (int) floatNum; //強制轉型

        System.out.println(floatNum + ";" + num);
    }
}
