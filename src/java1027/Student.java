package java1027;

public class Student {
    String name;
    int age;

    void joinClub() {
        System.out.println(name + "參加社團");
    }


    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.age = 20;
    }
}
