package var2.coffe.order;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Order implements Comparable<Order> {
    private static final Logger logger = (Logger) LogManager.getLogger(Order.class);
    private static int nextOrderNumber = 1;
    private int number;
    private String name;

    public Order(String customerName) {
        this.name = customerName;
        this.number = nextOrderNumber++;
        logger.info("Created Order: Number={}, Customer={}", number, customerName);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.number, other.number);
    }
}
