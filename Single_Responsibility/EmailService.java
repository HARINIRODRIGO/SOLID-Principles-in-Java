package Single_Responsibility;

public class EmailService {
    public void sendOrderConfirmationEmail(Order order) {
        // Code to send order confirmation email
        System.out.println("Sending order confirmation email to " + order.getCustomerEmail());
    }
}
