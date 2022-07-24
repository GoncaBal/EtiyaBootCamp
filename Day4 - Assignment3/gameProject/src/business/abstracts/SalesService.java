package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

import java.util.List;

public interface SalesService {
    void sell(Game game, Player player, Campaign campaign) throws Exception;

}
