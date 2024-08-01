import java.util.Scanner;

class ProductInfo {
    private String prodName;
    private String prodCode;

    // Constructor with correct parameter names
    public ProductInfo(String prodName, String prodCode) {
        this.prodName = prodName;
        this.prodCode = prodCode;
    }

    // Getter methods
    public String getName() {
        return prodName;
    }

    public String getCode() {
        return prodCode;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input
        String n = scanner.next();
        String c = scanner.next();

        // Create ProductInfo objects
        ProductInfo pf1 = new ProductInfo("codetree", "50");
        ProductInfo pf2 = new ProductInfo(n, c);

        // Print product information using getter methods
        System.out.println("Product " + pf1.getCode() + " is " + pf1.getName());
        System.out.println("Product " + pf2.getCode() + " is " + pf2.getName());
    }
}