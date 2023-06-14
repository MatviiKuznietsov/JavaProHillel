package Products5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Book", 120, true, LocalDate.of(2023, 7, 28));
        Product product2 = new Product("Box", 300, false, LocalDate.of(1914, 7, 5));
        Product product3 = new Product("Book", 20, true, LocalDate.of(2023, 7, 4));
        Product product4 = new Product("Ball", 50, false, LocalDate.of(2023, 7, 3));
        Product product5 = new Product("Book", 270, false, LocalDate.of(1914, 7, 15));
        Product product6 = new Product("Book", 420, true, LocalDate.of(1914, 7, 17));
        Product product7 = new Product("PC", 500, false, LocalDate.of(2023, 7, 21));
        Product product8 = new Product("Book", 70, false, LocalDate.of(1914, 7, 22));
        Product product9 = new Product("Mouse", 210, true, LocalDate.of(2023, 7, 29));
        Product product10 = new Product("Book", 36, false, LocalDate.of(2023, 7, 23));

        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        System.out.println("List of products - " + products);
        //------------------------------------------------------
        double sum = products.stream()
                .filter(x -> x.getDate().getYear() == 2023)
                .filter(x -> x.getType() == "Book")
                .filter(x -> x.getPrice() < 75)
                .mapToDouble(x -> x.getPrice())
                .sum();

        System.out.println("Summ books = " + sum);
    }
}

