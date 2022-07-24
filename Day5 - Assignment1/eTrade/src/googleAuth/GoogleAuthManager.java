package googleAuth;

public class GoogleAuthManager {
    public void checkIfGmailExists(String email)
    {
        if(email.contains("gmail"))
        {
            System.out.println("Google hesabı ile giriş yapıldı");
        }
        else
            System.out.println("Google hesabı ile giriş yapılamadı");
    }
}
