package java1027;

public class Student {

    // 私有的成員變數
    private String name;
    private int age;

    void joinClub() {
        System.out.println(name + "參加社團");
    }

    // 公共的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 10) {
            this.name = name;
        }

    }
}

class Main {
    public static void main(String[] args) {
        Student tom = new Student();
//        tom.name = "Tom";
        tom.setName("Tom");
//        tom.age = 20;
        System.out.println(tom.getName());
    }
}

