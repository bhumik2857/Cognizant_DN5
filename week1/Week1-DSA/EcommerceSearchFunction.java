class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearchFunction {

    public static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String target) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = products[mid].productName.compareToIgnoreCase(target);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Apple", "Fruit"),
                new Product(2, "Banana", "Fruit"),
                new Product(3, "Laptop", "Electronics"),
                new Product(4, "Mobile", "Electronics")
        };

        int linear = linearSearch(products, "Laptop");
        System.out.println("Linear Search Index: " + linear);

        int binary = binarySearch(products, "Laptop");
        System.out.println("Binary Search Index: " + binary);
    }
}