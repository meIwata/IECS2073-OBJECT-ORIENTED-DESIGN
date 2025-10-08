package java1008;

public class Demo {
    public static void main(String[] args) {
        /*
        GoodBook gb = (GoodBook) new Book(); // 強制轉型
        System.out.println(gb.toString());
         */

        Book fb = new Book();
//        System.out.println(((GoodBook)fb).shout());

        System.out.println(fb instanceof Book);
//        System.out.println(fb instanceof GoodBook);

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
        /*
        Integer i = 5;
        System.out.println(System.identityHashCode(i)); // 印出物件的記憶體位址
        i = 7;
        System.out.println(System.identityHashCode(i));
        */
        /*
        System.out.println(1+2);
        System.out.println("1"+ " "+"2");
         */
    }
}

abstract class Publication {

}

class Book extends Publication {
    public String toString() {
        return "This is a book";
    }
}
class GoodBook extends Publication {
    public String shout(){
        return "I am good";
    }
    public String toString() {
        return "This is a book";
    }
}