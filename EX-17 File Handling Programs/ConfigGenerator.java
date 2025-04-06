import java.io.*;
import java.util.Scanner;

public class ConfigGenerator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter application name:");
        String appName = sc.nextLine();
        
        System.out.println("Enter database URL:");
        String dbUrl = sc.nextLine();
        
        System.out.println("Enter username:");
        String username = sc.nextLine();
        
        System.out.println("Enter password:");
        String password = sc.nextLine();
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("config.properties"))) {
            pw.println("# Application Configuration");
            pw.println("app.name=" + appName);
            pw.println("db.url=" + dbUrl);
            pw.println("db.username=" + username);
            pw.println("db.password=" + password);
        }
        
        System.out.println("Configuration file created successfully!");
    }
}