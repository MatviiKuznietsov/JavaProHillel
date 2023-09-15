package app;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItemById(long id) {
        items.removeIf(item -> item.getId() == id);
    }

    public List<Product> getItems() {
        return items;
    }
}
