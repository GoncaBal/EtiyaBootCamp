package core.utilities.adapters;

import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements MailCheckService{
    @Override
    public void checkIfMailExist(String mail) {
        GoogleAuthManager googleAuthManager=new GoogleAuthManager();
        googleAuthManager.checkIfGmailExists(mail);
    }
}
