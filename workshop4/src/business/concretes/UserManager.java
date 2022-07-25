package business.concretes;

import business.abtracts.NotificationService;
import business.abtracts.UserService;
import entites.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    List<User> users=new ArrayList<>();
    NotificationService notificationService;

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void register(User user) {
        users.add(user);
        System.out.println("Kisi register oldu");
        notificationService.sendNotification(user);

    }

    @Override
    public void forgotPassword(User user) {
        System.out.println("Parola yenileme linki gonderildi");
        notificationService.sendNotification(user);
    }
}
