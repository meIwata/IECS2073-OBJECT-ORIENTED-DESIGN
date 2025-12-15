package java1215;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
    public static void main(String[] args) {
//        Set<String> roles = new HashSet<>(); // 無順序性、查詢、加入、刪除的效率較高、允許放入一個 null 值
//        Set<String> roles = new LinkedHashSet<String>(); // 有順序性(依照加入的先後順序)、查詢、加入、刪除的效率較高、允許放入一個 null 值
        Set<String> roles = new TreeSet<String>(); // 有順序性(依照字母排序)、查詢、加入、刪除的效率較低、不允許放入 null 值

        roles.add("Admin");
        roles.add("User");
        roles.add("Editor");
        roles.add("Student");
        roles.add("Teacher");

        for(String role : roles) {
            System.out.println(role);
        }
    }
}
