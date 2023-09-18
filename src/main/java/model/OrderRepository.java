package model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();
    private int nextId = 1;

    public OrderRepository() {
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product(1, "Product 1", 10.0));
        orders.add(new Order(nextId++, new Date(), 50.0, products1));

        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(2, "Product 2", 20.0));
        orders.add(new Order(nextId++, new Date(), 30.0, products2));
    }

    public void addOrder(Order order) {
        order.setId(nextId++);
        orders.add(order);
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}