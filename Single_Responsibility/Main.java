package Single_Responsibility;

public class Main {
    public static void main(String[] args) {

        // Creating an order object
        Order order = new Order("customer@example.com");
        
        // Add items to the order
        order.addItem(new OrderItem("Laptop", 1000.0, 1));  
        order.addItem(new OrderItem("Mouse", 50.0, 2)); 

        // Process the order
        OrderProcessingService orderProcessingService = new OrderProcessingService();
        orderProcessingService.processOrder(order);

        // Calculate the total amount
        double totalAmount = order.getTotalAmount();
        System.out.println("Total Amount: " + totalAmount);

        // Calculate discount
        DiscountService discountService = new DiscountService();
        double discount = discountService.calculateDiscount(order);
        System.out.println("Discount: " + discount);

        // Send order confirmation email
        EmailService emailService = new EmailService();
        emailService.sendOrderConfirmationEmail(order);
        
    }
}

