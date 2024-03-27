package FactoryMethord;

public class NotificationService {
    public static void main(String[] args) {
        try {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification smsNotification = notificationFactory.createNotification("EMAIL");
            smsNotification.notifyUser("Hello");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}