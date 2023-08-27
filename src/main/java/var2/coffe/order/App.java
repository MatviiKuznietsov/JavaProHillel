package var2.coffe.order;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        Order order1 = new Order("Vano");
        Order order2 = new Order("Petya");
        Order order3 = new Order("Bob");

        orderBoard.add(order1);
        orderBoard.add(order2);
        orderBoard.add(order3);

        orderBoard.draw();

        Order nextOrder = orderBoard.deliver();
        System.out.println("Delivered Order " + nextOrder.getNumber());

        orderBoard.draw();
    }
}
