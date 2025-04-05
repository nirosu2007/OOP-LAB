//Q. Library Book Tracking System
import java.util.Scanner;
class Book {
    String title, author;
    int bookId;
    void getBookDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = obj.nextLine();
        System.out.print("Enter Author Name: ");
        author = obj.nextLine();
        System.out.print("Enter Book ID: ");
        bookId = obj.nextInt();
    }
    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookId);
    }
}
class Library extends Book {
    String issueDate, returnDate;
    void getIssueDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Issue Date: ");
        issueDate = obj.nextLine();
        System.out.print("Enter Return Date: ");
        returnDate = obj.nextLine();
    }
    void displayIssueDetails() {
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Library book = new Library();
        book.getBookDetails();
        book.getIssueDetails();
        book.displayBookDetails();
        book.displayIssueDetails();
    }
}