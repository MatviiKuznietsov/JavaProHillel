package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private Order order;
    private Comparator<Order> priorytyOrde = (ord1, ord2) -> (int) (ord1.getPriority() - ord2.getPriority());
    private Queue<Order> orderQueue = new PriorityQueue<>(priorytyOrde);
    private int count = 0;

    public void add(String name) {
        Random random = new Random();
        order = new Order(name, ++count, random.nextInt(10));
        orderQueue.add(order);
    }

    public void deliver() {
        Order delOrder = orderQueue.remove();
        System.out.println("Order " + delOrder.getNumberOrder() + " had been done for: " + delOrder.getName());
    }

    public void deliver(int orderNumber) {
        int currentOrder = orderQueue.peek().getNumberOrder();
        if (orderNumber == currentOrder) {
            System.out.println("Order " + currentOrder + " done faster ");
        }
    }

    public void draw() {
        System.out.println("Numb : Name");
        for (Order order : orderQueue) {
            System.out.println(order.getNumberOrder() + "    : " + order.getName());
        }
    }

    public void viewQueue() {
        System.out.println(orderQueue);
    }
}
