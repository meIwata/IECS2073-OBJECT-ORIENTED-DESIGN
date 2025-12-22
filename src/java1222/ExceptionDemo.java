package java1222;

public class ExceptionDemo {
    public static void main(String[] args) {
        int scores[] = {85, 90, 78};
        System.out.println(scores.length);
        scores[3]=100; // ArrayIndexOutOfBoundsException，runtime exception
        System.out.println("end of program...");
    }
}
