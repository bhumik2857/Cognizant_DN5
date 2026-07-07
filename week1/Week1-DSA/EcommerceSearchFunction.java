import java.util.Arrays;
import java.util.Comparator;

class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Product Name: " + productName +
                ", Category: " + category;
    }
}

public class EcommerceSearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(target);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Apple", "Fruit"),
                new Product(104, "Mobile", "Electronics"),
                new Product(102, "Banana", "Fruit"),
                new Product(105, "Watch", "Accessories")
        };

        String searchProduct = "Laptop";

        System.out.println("===== Linear Search =====");

        Product linearResult = linearSearch(products, searchProduct);

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\n===== Binary Search =====");

        Product binaryResult = binarySearch(products, searchProduct);

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product Not Found");
    }
}