package Orders;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class OrderRepository {
    private Map<Integer, Order> orders = new HashMap<>();
    private int nextOrderId = 1;


    public Order getOrderById(int id) {
        return orders.get(id);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public void addOrder(Order order) {
        order.setId(nextOrderId++);
        orders.put(order.getId(), order);
    }
}
