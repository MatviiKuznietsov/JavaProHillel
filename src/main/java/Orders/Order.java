package Orders;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private int id;
    private Date date;
    private double cost;
    private List<Product> products;

    public Order(int id, Date date, double cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }
}
