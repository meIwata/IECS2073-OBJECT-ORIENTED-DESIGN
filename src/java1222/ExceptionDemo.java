package java1222;

public class ExceptionDemo {
    public static void main(String[] args) {
        int scores[] = {85, 90, 78};
        System.out.println(scores.length);

        try {
            scores[3] = 100; // ArrayIndexOutOfBoundsException，runtime exception
            System.out.println("end of try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // 捕獲並處理例外，印出錯誤訊息
            System.out.println("end of catch block");
        } finally {
            System.out.println("end of finally block");
        }
        System.out.println("end of program");
    }
}
