package coffee.order;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Ivan");
        coffeeOrderBoard.add("Dmitro");
        coffeeOrderBoard.add("Nikita");
        coffeeOrderBoard.add("Ben");
        coffeeOrderBoard.add("Anna");
        coffeeOrderBoard.add("Lenny");
        coffeeOrderBoard.add("Typak");
        coffeeOrderBoard.viewQueue();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.draw();
    }


}
