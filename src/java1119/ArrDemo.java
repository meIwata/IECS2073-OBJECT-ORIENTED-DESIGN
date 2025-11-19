package java1119;

public class ArrDemo {
    public static void main(String args[]) {
        //Integer[] arr = new Integer[5]{1,2,3,4,5};
        //int[] arr = new int[10];
        //char[] arr = new char[10];
        //System.out.printf(arr[0].intValue() + "," + arr[1]);
        //System.out.printf(arr[0] + "," + arr[1]);
		/*
		Book[] arr = new Book[3];
		arr[0] = new Book("A");
		arr[1] = new Book("B");
		arr[2] = new Book("C");
		Book[] brr = arr;
		System.out.println(arr + "," + brr);
		System.out.println(brr[0] + "," + brr[1]);
		brr[0].name = "foo";
		System.out.println(arr[0] + "," + arr[1]);
		System.out.println(brr[0] + "," + brr[1]);
		brr[1].set(brr[0]);
		System.out.println(brr[0] + "," + brr[1]);
		*/

        String a = new String("foo");
        String b = new String("foo");

        System.out.println((a == b) + "," + a.equals(b) + "," + (a.compareTo(b) == 0));
    }

    abstract class Publication {
    }

    class Book extends Publication {
        public String name;

        public Book() {
            name = "book";
        }

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
        public String shout() {
            return "I am good";
        }
    }
}