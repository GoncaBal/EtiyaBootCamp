import business.concretes.EmailNotificationManager;
import business.concretes.SmsNotificationManager;
import business.concretes.UserManager;
import entites.User;

public class Main {
    public static void main(String[] args) {
        User user1= new User(1,"Gonca","Bal","goncabal@gmail.com","12365");
        UserManager userManager=new UserManager(new EmailNotificationManager());
        userManager.register(user1);

    }
}
