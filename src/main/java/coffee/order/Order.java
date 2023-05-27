package coffee.order;

public class Order {
    private int numberOrder;
    private String name;
    private int priority;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Order(String name, int numberOrder, int priority) {
        this.numberOrder = numberOrder;
        this.name = name;
        this.priority = priority;

    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "numberOrder=" + numberOrder +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
