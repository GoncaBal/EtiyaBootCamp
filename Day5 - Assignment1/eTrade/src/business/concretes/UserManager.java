package business.concretes;

import business.abtracts.UserService;
import core.utilities.adapters.MailCheckService;
import core.utilities.patterns.RegexMatches;
import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

import javax.xml.crypto.Data;
import java.util.List;

public class UserManager implements UserService {
    private RegexMatches regexMatches;
    private DataRepository<User> dataRepository;
    private MailCheckService mailCheckService;

    public UserManager(RegexMatches regexMatches, DataRepository dataRepository,MailCheckService mailCheckService) {
        this.regexMatches = regexMatches;
        this.dataRepository = dataRepository;
        this.mailCheckService=mailCheckService;
    }

    @Override
    public void add(User user) {
        if (regexMatches.namePattern(user.getFirstName()) && regexMatches.namePattern(user.getLastName())) {
            if (regexMatches.emailPattern(user.getEmail())) {
                if (!checkIfEmailexist(user.getEmail())) {
                    if (regexMatches.passwordPattern(user.getPassword())) {
                        dataRepository.add(user);
                        System.out.println("User eklendi");
                        System.out.println("Doğrulama e-postası gönderildi");
                    } else {
                        System.out.println("Parola en az altı karakter olmalı");
                    }
                } else {
                    System.out.println("email zaten ekli");
                }
            } else {

                System.out.println("Geçersiz email formatı");
            }
        } else {
            System.out.println("Ad ya da soyad en az 2 karakter olmalı!");
        }
    }

    @Override
    public void update(User user) {
        dataRepository.update(user);
    }

    @Override
    public void delete(User user) {
        dataRepository.delete(user);
    }

    @Override
    public List<User> getAll() {
        return dataRepository.getAll();
    }

    @Override
    public User getUserById(int id) {
        return dataRepository.getById(id);
    }

    @Override
    public void loginCheck(String email, String password) {

        for(User user:dataRepository.getAll()){
            if (user.getEmail()==email&&user.getPassword()==password){
                System.out.println("Giriş başarılı");
            }else{
                System.out.println("Giriş başarısız");
            }
        }
    }

    @Override
    public void loginWithGoogle(String mail) {
        mailCheckService.checkIfMailExist(mail);
    }

    private boolean checkIfEmailexist(String email) {
        boolean exist = false;
        for (User user : dataRepository.getAll()) {
            if (user.getEmail() == email) {
                exist = true;
            }
        }
        return exist;
    }

}
