package FactoryMethord;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from PushNotification");
    }
}
