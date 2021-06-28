import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("abc debd asdj");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        char[] a = new char[20];
        fileReader.read(a);
        for (char c: a){
            System.out.print(c);
        }
        fileReader.close();
    }
}
