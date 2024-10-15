package Single_Responsibility;

public class DiscountService {
    public double calculateDiscount(Order order) {
        // Code to calculate discount based on the order
        if (order.getTotalAmount() > 100) {
            return order.getTotalAmount() * 0.1; // 10% discount
        }
        return 0;
    }
}
