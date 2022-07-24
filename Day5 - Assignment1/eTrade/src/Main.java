import business.concretes.UserManager;
import business.ui.Login;
import core.utilities.adapters.GoogleAuthManagerAdapter;
import core.utilities.patterns.RegexMatches;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Gonca", "Bal", "goncabal@gmail.com", "987456321");
        // User user2 = new User(1, "rabia", "çakır", "rabia@gmail.com", "1255555");
        UserManager userManager = new UserManager(new RegexMatches(), new UserRepository(),new GoogleAuthManagerAdapter());

        userManager.add(user1);
        Login login = new Login(userManager);
        login.loginWithGoogle(user1.getEmail());
        // userManager.add(user2);
    }
}
