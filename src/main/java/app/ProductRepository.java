package app;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "Product1", 10.0));
        products.add(new Product(2, "Product2", 20.0));
        products.add(new Product(3, "Product3", 30.0));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
