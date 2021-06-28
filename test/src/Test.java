import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c != -1){
            System.out.println((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
         String s = "hello";
         fileOutputStream.write(s.getBytes());
    }
}
