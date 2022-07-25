package business.abtracts;

import entites.User;

public interface UserService {
    void register(User user);
    void forgotPassword(User user);
}
