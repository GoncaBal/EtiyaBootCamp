public class UserManager {
    public void login(User user) {
        System.out.println(user.getFirstName() + " login oldu. ");
    }

    public void add(User user) {
        System.out.println(user.getFirstName() + " eklendi. ");
    }

    public void update(User user) {
        System.out.println(user.getFirstName() + " guncellendi. ");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " silindi. ");
    }
}
