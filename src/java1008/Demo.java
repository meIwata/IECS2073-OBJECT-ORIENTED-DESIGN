package java1008;

public class Demo {
    public static void main(String[] args) {
    /*
//    Publication pp = new Publication();
      Publication bb  = new Book();
        System.out.println(bb);
     */
        /*
        int i =9;
        double d = i;
        double dd = 3.7;
        int ii = (int) dd; // 強轉型成int
        System.out.println(d + " " + ii);
        */
        Integer i = 5;
        System.out.println(System.identityHashCode(i)); // 印出物件的記憶體位址
        i = 7;
        System.out.println(System.identityHashCode(i));
    }
}
abstract class Publication{

}
class Book extends Publication{
    public String toString(){
        return "This is a book";
    }
}