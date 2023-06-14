package Products5;

import java.time.LocalDate;

public class Product {
    static public String findProduct = "Book";
    private String type;
    private double price;

    private boolean discount;

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public Product(String type, double price, boolean discount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}';
    }
}
