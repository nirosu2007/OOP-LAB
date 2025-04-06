//Q.E-Commerce System(product-electronic-smartphone)
import java.util.Scanner;
class Product {
    String productName;
    void getProductName() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        productName = obj.nextLine();
    }
    void displayProductName() {
        System.out.println("Product: " + productName);
    }
}
class Electronics extends Product {
    String brand;
    void getBrand() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        brand = obj.nextLine();
    }
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
class Smartphone extends Electronics {
    int ram;
    void getRAM() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter RAM (GB): ");
        ram = obj.nextInt();
    }
    void displayRAM() {
        System.out.println("RAM: " + ram + "GB");
    }
}
public class ECommerceSystem {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.getProductName();
        phone.getBrand();
        phone.getRAM();
        phone.displayProductName();
        phone.displayBrand();
        phone.displayRAM();
    }
}