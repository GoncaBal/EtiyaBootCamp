package business.abstracts;

import entities.concretes.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    void add(Player player) throws Exception;
    void update(Player player);
    void delete(Player player);
    Optional<Player> getByPlayerId(int id);
    List<Player> getAll();
}
