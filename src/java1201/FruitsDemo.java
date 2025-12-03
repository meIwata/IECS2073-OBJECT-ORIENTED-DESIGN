package java1201;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合 - 水果案例
 */
public class FruitsDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>(); // 限定這個List只能放型別為String的物件
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String firstFruit = fruits.get(0); // 不需要強制轉型
        System.out.println("First fruit: " + firstFruit);

        // 增強型for迴圈
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("--------------");

        // 使用Iterator介面
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        fruits.set(0, "Mango");
        System.out.println("After modification:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();


        fruits.remove(0);
        System.out.println("After removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("List的長度: " + fruits.size());
        System.out.println();

        fruits.clear(); // 清空集合
        System.out.println("After clearing, List的長度: " + fruits.size());
    }


}
