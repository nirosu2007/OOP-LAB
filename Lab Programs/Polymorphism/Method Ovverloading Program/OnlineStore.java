//Q.Shopping Cart
import java.util.Scanner;
class ShoppingCart {
    Scanner obj=new Scanner(System.in);
    void addItem() {
        System.out.print("Enter item name: ");
        String item=obj.nextLine();
        System.out.println("Added "+item+" to cart");
    }
    void addItem(String item) {
        System.out.print("Enter quantity: ");
        int quantity=obj.nextInt();
        System.out.println("Added "+quantity+" "+item+"(s) to cart");
    }
    void addItem(String item,int quantity) {
        System.out.print("Enter price: ");
        double price=obj.nextDouble();
        System.out.println("Added "+quantity+" "+item+"(s) at $"+price+" each");
    }
}
public class OnlineStore {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.addItem();
        cart.obj.nextLine(); // Clear buffer
        cart.addItem("Shirt");
        cart.addItem("Pants",2);
    }
}