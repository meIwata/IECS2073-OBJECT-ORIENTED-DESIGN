package java1229;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("\\Users\\Lulu Liao\\Documents\\FCU\\OOP0922");
        System.out.println("Is dir: " + f.isDirectory());
        System.out.println(f.getAbsoluteFile());
        File childFiles[] = f.listFiles();
        for (File child : childFiles) {
            System.out.println("Child: " + child.getName());
        }
    }

}
