package java1229;

import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) {
//        File folder = new File("testDir");
//        folder.mkdir(); // 建立一個目錄
        try {
            FileReader f = new FileReader("./testDir/data.csv");
            BufferedReader br = new BufferedReader(f);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
