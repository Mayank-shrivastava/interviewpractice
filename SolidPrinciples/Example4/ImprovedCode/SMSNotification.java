package SolidPrinciples.Example4.ImprovedCode;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification: " + message);
    }
}
