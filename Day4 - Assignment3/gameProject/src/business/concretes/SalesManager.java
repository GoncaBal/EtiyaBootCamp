package business.concretes;

import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public class SalesManager implements SalesService {

    PlayerService playerService;

    public SalesManager(PlayerService playerService) {

        this.playerService = playerService;
    }

    @Override
    public void sell(Game game, Player player, Campaign campaign) throws Exception {
        double lastPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount()/100);
        if (playerService.getByPlayerId(player.getId()).isPresent()) {
            System.out.println("Satis gerceklesti: " + player.getFirstName() + " "
                    + game.getName() + " aldi. Fiyat: "+game.getPrice()+" TL. " + campaign.getName() + " %" + campaign.getDiscount() + " Son fiyat: " + lastPrice+" TL");
        }
    }
}
