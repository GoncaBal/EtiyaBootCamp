package dataAccess.concretes;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Game;
import entities.concretes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerRepository implements BaseRepository<Player> {

    List<Player> players=new ArrayList<>();

    @Override
    public void add(Player entity) {
        players.add(entity);
        System.out.println("Oyuncu eklendi: "+entity.getFirstName());
    }

    @Override
    public void update(Player entity) {

        System.out.println("Oyuncu güncellendi: "+ entity.getFirstName());
    }

    @Override
    public void delete(Player entity) {
        getById(entity.getId()).ifPresent(player -> players.remove(entity));
        System.out.println("Oyuncu silindi: "+entity.getFirstName());
    }

    @Override
    public Optional<Player> getById(int id) {
        return players.stream().filter(player -> player.getId()==id).findAny();
    }

    @Override
    public List<Player> getAll() {
        return players;
    }
}
