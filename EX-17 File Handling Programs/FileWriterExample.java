import java.io.*;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to write:");
        String filePath = sc.nextLine();
        
        System.out.println("Enter text to write:");
        String text = sc.nextLine();
        
        System.out.println("Append (A) or Overwrite (O)?");
        char choice = sc.next().charAt(0);
        
        try (FileWriter fw = new FileWriter(filePath, choice == 'A' || choice == 'a')) {
            fw.write(text + "\n");
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file!");
        }
    }
}