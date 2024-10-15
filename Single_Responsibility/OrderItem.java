package Single_Responsibility;

public class OrderItem {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public OrderItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for the properties
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Get the total price for this item (price * quantity)
    public double getTotalPrice() {
        return price * quantity;
    }
}
