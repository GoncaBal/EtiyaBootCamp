import business.abstracts.GameService;
import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.adapters.mernisAdapter.MernisServiceAdapter;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public class Main {
    public static void main(String[] args) throws Exception {

        PersonCheckService personCheckService=new MernisServiceAdapter();
        PlayerService playerService=new PlayerManager(new PlayerRepository(),personCheckService);
        Player player1=new Player(1,"Gonca","Bal",1994,"13510471338");

        playerService.add(player1);
        System.out.println(playerService.getAll());

        Game game=new Game(new Campaign(1,"Yaz indirimi",10),1,"Gta","oyun",100);

        SalesService salesService=new SalesManager(playerService);
        salesService.sell(game,player1,game.getCampaign());

        GameService gameService=new GameManager(new GameRepository());
        gameService.add(game);
        System.out.println(gameService.getAll());

    }
}
