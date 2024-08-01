import java.util.Scanner;

class ProductInfo {
    private String prodName;
    private String prodCode;

    public ProductInfo(String prodName, String prodCode) {
        this.prodName = prodName;
        this.prodCode = prodCode;
    }

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

        String inputName = scanner.next();
        String inputCode = scanner.next();

        ProductInfo defaultProduct = new ProductInfo("codetree", "50");
        ProductInfo userProduct = new ProductInfo(inputName, inputCode);

        System.out.println("product " + defaultProduct.getCode() + " is " + defaultProduct.getName());
        System.out.println("product " + userProduct.getCode() + " is " + userProduct.getName());
    }
}