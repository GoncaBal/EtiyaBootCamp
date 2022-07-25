package business.concretes;

import business.abtracts.NotificationService;
import entites.User;

public class SmsNotificationManager implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sms olarak mesaj yollandi: "+user.getFirstName()+" "+user.getLastName());
    }
}
