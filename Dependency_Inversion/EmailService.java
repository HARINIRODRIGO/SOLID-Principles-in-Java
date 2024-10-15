package Dependency_Inversion;

public class EmailService implements NotificationSender{

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
 
}
