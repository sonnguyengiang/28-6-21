package com.company;

import java.io.*;
import java.util.Scanner;

public class ReadFileExmple {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("count = " + sum);
        } catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) throws IOException {


        System.out.print("enter a link file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExmple readFileExmple = new ReadFileExmple();
        readFileExmple.readFileText(path);
    }
}
