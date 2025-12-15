package java1215;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
//        Set<String> roles = new HashSet<>(); // 無順序性、查詢、加入、刪除的效率較高、允許放入一個 null 值
//        Set<String> roles = new LinkedHashSet<String>(); // 有順序性(依照加入的先後順序)、查詢、加入、刪除的效率較高、允許放入一個 null 值
//        Set<String> roles = new TreeSet<String>(); // 有順序性(依照字母排序)、查詢、加入、刪除的效率較低、不允許放入 null 值，如果加入一樣的元素，size 不會增加
        List<String> roles = new ArrayList<>(); // 有順序性(依照加入的先後順序)、允許放入重複的元素、允許放入多個 null 值，size 會增加


        roles.add("Admin");
        roles.add("User");
        roles.add("User");
        roles.add("Editor");
        roles.add("Student");
        roles.add("Teacher");

        System.out.println(roles.size());

        for(String role : roles) {
            System.out.println(role);
        }
    }
}
