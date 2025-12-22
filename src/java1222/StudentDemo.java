package java1222;

public class StudentDemo {
    private String sid;
    private String name;
    private int age;

    public StudentDemo(String number, String tom, int age) {
        this.sid = number;
        this.name = tom;
        this.age = age; // 直接設定，避免在建構子拋出 checked exception
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("年齡不能為負數");
        } else if (age > 150) {
            throw new AgeException("年齡不能大於150歲");
        }
        this.age = age;
    }
}
