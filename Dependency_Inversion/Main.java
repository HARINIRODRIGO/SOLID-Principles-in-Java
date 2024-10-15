package Dependency_Inversion;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailService();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello via Email!");

        NotificationSender smsSender = new SMSService();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello via SMS!");
    }
}
