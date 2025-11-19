package java1119;

public class ArrDemo {
    public static void main(String[] args) {
//        Integer[] arr = new Integer[10];
//        System.out.println(arr[0] + ", " + arr[1]); // null, null
//        System.out.println(arr[0].intValue() + ", " + arr[1]); // null, null

//        int[] arr = new int[10];
//        System.out.println(arr[0] + ", " + arr[1]); // 0, 0

//        char[] arr = new char[10];
//        System.out.println("[" + arr[0] + "], [" + arr[1] + "]"); // [ ], [ ]

        Book[] arr = new Book[3];
        arr[0] = new Book("A");
        arr[1] = new GoodBook("B");
        arr[2] = new Book("C");
        Book[] brr = arr;
        System.out.println(brr[0] + ", " + brr[1]);
        brr[0].name = "foo";
        System.out.println(arr[0] + ", " + arr[1]);
        brr[0].set(brr[0]);
        System.out.println(brr[0]+", "+brr[1]);
    }
}

abstract class Publication {
}

class Book extends Publication {
    public String name;

    public Book(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

    public void set(Book in) {
        name = in.name;
        in.name = in.name + "_used";
    }
}

class GoodBook extends Book {
    public GoodBook(String n) {
        super(n);
    }

    public String shout() {
        return "Good Book: " + name;
    }
}