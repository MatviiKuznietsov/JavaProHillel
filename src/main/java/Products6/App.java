package Products6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Book", 120, true, LocalDate.of(2023, 7, 28));
        Product product2 = new Product(2, "Box", 300, false, LocalDate.of(1914, 7, 5));
        Product product3 = new Product(3, "Toy", 20, true, LocalDate.of(2023, 7, 4));
        Product product4 = new Product(4, "Ball", 50, false, LocalDate.of(2023, 7, 3));
        Product product5 = new Product(5, "Book", 270, false, LocalDate.of(1914, 7, 15));
        Product product6 = new Product(6, "Book", 420, true, LocalDate.of(1914, 7, 17));
        Product product7 = new Product(7, "Ball", 500, false, LocalDate.of(2023, 7, 21));
        Product product8 = new Product(8, "Book", 70, false, LocalDate.of(1914, 7, 22));
        Product product9 = new Product(9, "Toy", 210, true, LocalDate.of(2023, 7, 29));
        Product product10 = new Product(10, "Book", 36, false, LocalDate.of(2023, 7, 23));

        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        System.out.println("List of products - " + products);
        //------------------------------------------------------
        Map<String, List<Product>> productByType = products.stream().collect(Collectors.groupingBy(Product::getType));

        System.out.println(productByType);
        productByType.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
    }
}

