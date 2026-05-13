package SolidPrinciples.Example4.ImprovedCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<Notification> notifications, String message) {
        for (Notification notification : notifications) {
            notification.sendNotification(message);
        }
    }
}

// This sender class is not tightly coupled to any notification type
// Hence this class is closed for modification but open for extension, we can add any type of notification without modifying this class.


// We should try to think that if further alteration in the requirements
// can uncessary impact code of a class, it is violating OCP. 

// Interfaces are implement to represent any notification
// Individual type of notification is implemented in separate class which implements the notification interface.

// Notification sender instead of being tightly coupled to type of notifications we now depend on Notification interface. 

// Even if we introduce new type of notifications or remove any older one, the sender class is not impacted. 


// Key idea:
// It is a good idea to depend on abstractions rather than concrete classes. 