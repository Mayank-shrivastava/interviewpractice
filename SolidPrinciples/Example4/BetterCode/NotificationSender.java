package SolidPrinciples.Example4.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<String> notificationTypes, String message) {
        for (String type : notificationTypes) {
            switch (type) {
                case "SMS":
                    SMSNotification smsNotification = new SMSNotification();
                    smsNotification.sendSMSNotification(message);
                    break;
                case "EMAIL":
                    EmailNotification emailNotification = new EmailNotification();
                    emailNotification.sendEmailNotification(message);
                    break;
                case "PUSH":
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendPushNotification(message);
                    break;
            }
        }
    }
}


// Here problem stays of having all notification types in one class, 
// here another principles come into picture ocp (open close principle)
// OCP states that a class should be open for extension but closed for modifification
// here this given class is being modified every time we introduce or remove any type of notification.

// This is a clear violation of OCP. 