package business.abstracts;

import entities.concretes.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    Optional<Game> getGameById(int id);
    List<Game> getAll();
}
