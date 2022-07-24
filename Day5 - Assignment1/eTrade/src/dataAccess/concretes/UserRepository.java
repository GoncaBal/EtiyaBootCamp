package dataAccess.concretes;

import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements DataRepository<User> {
    List<User> users=new ArrayList<>();
    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void add(User entity) {
        users.add(entity);
    }

    @Override
    public void delete(User entity) {
        System.out.println("User silindi");
    }

    @Override
    public void update(User entity) {
        System.out.println("User güncellendi");
    }
}
