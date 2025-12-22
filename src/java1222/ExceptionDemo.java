package java1222;

public class ExceptionDemo {
    public static void main(String[] args) {

        int scores[] = {85, 90, 78};

        try {
            int result = 3 /1;
            scores[3] = 100;
            System.out.println("end of try block");
        }

        // 版本一: 一個一個捕獲，建議使用這種!!!
        catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
            System.out.println("end of ArithmeticException catch block");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(arrayIndexOutOfBoundsException.getMessage()); // 捕獲並處理例外，印出錯誤訊息
            System.out.println("end of ArithmeticException catch block");
        }

        // 版本二: 用父類直接捕獲
//        catch (RuntimeException runtimeException) {
//            System.out.println(runtimeException.getMessage());
//            System.out.println("end of RuntimeException catch block");
//        }
        finally {
            System.out.println("end of finally block");
        }

        System.out.println("end of program...");

        /*
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
        System.out.println("end of program...");
        */

    }
}
