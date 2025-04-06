import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to count words:");
        String filePath = sc.nextLine();
        
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total words: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error: File not found!");
        }
    }
}