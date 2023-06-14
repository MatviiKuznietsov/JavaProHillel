package Products1;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Product product1 =new Product("Book", 120);
        Product product2 =new Product("Box", 300);
        Product product3 =new Product("Book", 80);
        Product product4 =new Product("Ball", 50);
        Product product5 =new Product("Book", 270);
        Product product6 =new Product("Book", 420);
        Product product7 =new Product("PC", 500);
        Product product8 =new Product("Book", 70);
        Product product9 =new Product("Mouse", 210);
        Product product10 =new Product("Book", 450);

        ArrayList <Product> products = new ArrayList<>();
        Collections.addAll(products, product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        System.out.println("List of products - " + products);
        products.stream()
                .filter(x->x.getType() == "Book")
                .filter(x->x.getPrice()>250)
                .forEach(x -> System.out.println("Product - " + x));


    }
}
