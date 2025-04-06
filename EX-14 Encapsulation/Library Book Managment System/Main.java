import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailability(boolean isAvailable) { this.isAvailable = isAvailable; }
    public String getStatus() { return isAvailable ? "Available" : "Not Available"; }
    public String getTitle() { return title; }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Book book = new Book();
        System.out.print("Enter book title: ");
        book.setTitle(obj.nextLine());
        System.out.print("Enter author: ");
        book.setAuthor(obj.nextLine());
        System.out.print("Is the book available? (true/false): ");
        book.setAvailability(obj.nextBoolean());
        System.out.println(book.getTitle() + " status: " + book.getStatus());
    }
}