package business.ui;

import business.abtracts.UserService;

public class Login {
    private UserService userService;

    public Login(UserService userService) {
        this.userService = userService;
    }
    public void login(String mail,String password){
        userService.loginCheck(mail, password);
    }
    public void loginWithGoogle(String mail){
        userService.loginWithGoogle(mail);
    }
}
