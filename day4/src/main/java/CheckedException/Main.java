package CheckedException;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String textPath = "C:\\Users\\shivam kumar jha\\OneDrive\\Desktop\\week4\\day4\\src\\main\\java\\CheckedException\\data.txt";

        try(FileReader fileReader = new FileReader(textPath);
            BufferedReader reader = new BufferedReader(fileReader)) {
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
