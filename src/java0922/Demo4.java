package java0922;

public class Demo4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 == num2); // true

        String tom1 = "Tom";
//        String tom2 = "Tom";
        String tom2 = new String("TOM");
        String tom3 = tom2;
        System.out.println(tom1 == tom2); // false，因為tom2是新建的物件
        System.out.println(tom1.equals(tom2)); // true

        System.out.println(tom3 == tom2); // 同一個記憶體位置
        System.out.println(tom1.equalsIgnoreCase(tom3)); // 比較內容是否相同，忽略大小寫

        /**
         * ==是在問兩個參考變數是否指向同一個物件(同一個記憶體位置)
         * equals()是在問兩個物件的內容是否相同
         * */
    }
}
