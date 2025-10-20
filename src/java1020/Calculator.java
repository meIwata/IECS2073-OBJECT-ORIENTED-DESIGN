package java1020;

public class Calculator {
    // Overloading 多載
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    /*
    double add(int a, int b){
        return (double) a + b; // 這個方法會導致編譯錯誤，因為與 int add(int a, int b) 簽名相同
    }
    */
}
