package Products2;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Book", 120, true);
        Product product2 = new Product("Box", 300, false);
        Product product3 = new Product("Book", 80, true);
        Product product4 = new Product("Ball", 50, false);
        Product product5 = new Product("Book", 270, false);
        Product product6 = new Product("Book", 420, true);
        Product product7 = new Product("PC", 500, false);
        Product product8 = new Product("Book", 70, false);
        Product product9 = new Product("Mouse", 210, true);
        Product product10 = new Product("Book", 450, false);

        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        System.out.println("List of products - " + products);
        products.stream()
                .filter(x -> x.getType() == "Book")
                .filter(x -> x.isDiscount() == true)
                .forEach(x -> {
                    x.setPrice(x.getPrice() * 0.9);
                    System.out.println("Product - " + x);
                });


    }
}
