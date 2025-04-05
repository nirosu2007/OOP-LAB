import java.util.Scanner;

interface Encryptor {
    String encrypt(String text);
    String decrypt(String text);
}

class CaesarCipher implements Encryptor {
    private int shift = 3;
    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) 
            result.append((char)(c + shift));
        return result.toString();
    }
    public String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) 
            result.append((char)(c - shift));
        return result.toString();
    }
}

public class FileEncryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encryptor encryptor = new CaesarCipher();
        
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        
        System.out.println("1-Encrypt, 2-Decrypt: ");
        int choice = sc.nextInt();
        
        if (choice == 1) System.out.println("Encrypted: " + encryptor.encrypt(text));
        else System.out.println("Decrypted: " + encryptor.decrypt(text));
        
        sc.close();
    }
}