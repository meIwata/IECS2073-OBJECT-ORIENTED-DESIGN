package java1027;

public class Student {

    // 私有的成員變數
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void joinClub() {
        System.out.println(name + "參加社團");
    }

    // 公共的getter和setter方法
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        if (name.length() < 10) {
//            this.name = name;
//        } else {
//            System.out.println("名字太長了，不可修改");
//        }
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        if (age > 15 && age < 100) {
//            this.age = age;
//        }
//    }
}

class Main {
    public static void main(String[] args) {

        Student tom = new Student("Tom", 18); // 一開始被建立起來，裡面的參數就被設定好，不可更改。(因為也沒有setter方法)

//        tom.name = "Tom";
//        tom.setName("Tom123");
//        tom.age = 20;
        System.out.println(tom.getName());

//        tom.setName("Tom"); // 這樣的物件是可變物件(Immutable Object)
    }
}

