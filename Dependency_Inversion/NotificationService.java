package Dependency_Inversion;

public class NotificationService {
    private NotificationSender notificationSender;

    // Inject the dependency via constructor
    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}
