package java1119;

public class Demo {
    public static void main(String[] args) {
        String a = new String("foo");
        String b = new String("foo");
        System.out.println(a == b);          // false
        System.out.println(a.equals(b));     // true 內容相同
        System.out.println(a.compareTo(b)); // 內容相同就會是0
    }

}
