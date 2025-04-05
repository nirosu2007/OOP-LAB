//Q.Greeting Generator
import java.util.Scanner;
class Greeting {
    Scanner obj=new Scanner(System.in);
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayHello(String name) {
        System.out.print("Enter your name: ");
        name=obj.nextLine();
        System.out.println("Hello, "+name+"!");
    }
    void sayHello(String name,String time) {
        System.out.print("Enter time of day: ");
        time=obj.nextLine();
        System.out.println("Good "+time+", "+name+"!");
    }
}
public class GreetingApp {
    public static void main(String[] args) {
        Greeting greet=new Greeting();
        greet.sayHello();
        greet.sayHello("");
        greet.sayHello("Alice","");
    }
}