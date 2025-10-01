package java1001;

class Publish {
//    private String title;
    protected String title;

    public Publish() {
        this.title = "foo";
    }

    public Publish(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}

class Book extends Publish {
    public Book(String title) {
        super(title);
//        this.title = title;
    }
}

public class MyPublic {
    public static void main(String[] args) {
        System.out.println(new Publish("Hello World!").getTitle());
    }
}
