package test;

import com.company.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Read readAndWriteFile = new Read();
        List<Integer> numbers = readAndWriteFile.readFile("numbers");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt",maxValue);
    }
}
