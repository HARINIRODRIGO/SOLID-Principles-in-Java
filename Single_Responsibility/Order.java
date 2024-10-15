package Single_Responsibility;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerEmail;
    private List<OrderItem> items;

    // Constructor
    public Order(String customerEmail) {
        this.customerEmail = customerEmail;
        this.items = new ArrayList<>();
    }

    // Getter for customer email
    public String getCustomerEmail() {
        return customerEmail;
    }

    // Method to add items to the order
    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    // Method to calculate total amount based on the items
    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Getter for items
    public List<OrderItem> getItems() {
        return items;
    }
}
