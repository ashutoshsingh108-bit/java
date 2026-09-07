import java.util.Arrays;
import java.util.List;

public class Product {
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return this.price * this.quantity;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(101, "Laptop", 45000.0, 1),
            new Product(102, "Mouse", 750.0, 2),
            new Product(103, "Keyboard", 1200.0, 1)
        );

        double subtotal = 0;
        for (Product p : products) {
            subtotal += p.totalCost();
        }

        double discount = subtotal > 5000 ? subtotal * 0.10 : 0;
        double totalBill = subtotal - discount;

        for (Product p : products) {
            System.out.printf("[%d] %s: ₹%.2f%n", p.productId, p.name, p.totalCost());
        }

        System.out.printf("Subtotal: ₹%.2f%n", subtotal);
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Total bill: ₹%.2f%n", totalBill);
    }
}