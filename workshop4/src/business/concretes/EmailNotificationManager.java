package business.concretes;

import business.abtracts.NotificationService;
import entites.User;

public class EmailNotificationManager implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Email olarak mesaj yollandi: "+user.getFirstName()+" "+user.getLastName());
    }
}
