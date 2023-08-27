package var2.coffe.order;
import java.util.PriorityQueue;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> ordersQueue = new PriorityQueue<>();

    public void add(Order order) {
        ordersQueue.add(order);
    }

    public Order deliver() {
        return ordersQueue.poll();
    }

    public Order deliver(int orderNumber) {
        Order foundOrder = null;
        for (Order order : ordersQueue) {
            if (order.getNumber() == orderNumber) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder != null) {
            ordersQueue.remove(foundOrder);
        }
        return foundOrder;
    }

    public void draw() {
        for (Order order : ordersQueue) {
            System.out.println("Order " + order.getNumber() + " - Customer: " + order.getName());
        }
    }
}
