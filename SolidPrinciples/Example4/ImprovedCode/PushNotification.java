package SolidPrinciples.Example4.ImprovedCode;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification: " + message);
    }
}
