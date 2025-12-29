package java1229;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File folder = new File("testDir");
        folder.mkdir(); // 建立一個目錄
    }
}
