package java1215;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Student{
    private String sid;
    private String name;
    private int age;

    public Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }
    public String getSid() {
        return sid;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Finder{
    public static Student find(Set<Student> students, String sid) {
        for (Student student : students) {
            if (student.getSid().equals(sid)) {
                return student;
            }
        }
        return null;
    }

    public static Student find(Map<String, Student> students, String sid) {
        for (Student student : students.values()) {
            if (student.getSid().equals(sid)) {
                return student;
            }
        }
        return null;
    }


}

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<String, Student>();
        Student s1 = new Student("123", "James", 25);
        Student s2 = new Student("124", "Curry", 28);
        Student s3 = new Student("125", "John", 25);

        for(String sid: students.keySet()) {
            System.out.println(sid + "; name " + students.get(sid).getName() +"; age" + students.get(sid).getAge());
        }

        /*
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Student findedStudent = new Finder().find(students, "124");
        System.out.println(findedStudent.getName());
        */

    }
}
