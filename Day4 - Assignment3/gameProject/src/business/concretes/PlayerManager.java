package business.concretes;

import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Player;

import java.util.List;
import java.util.Optional;

public class PlayerManager implements PlayerService {

    private final BaseRepository<Player> baseRepository;
    private PersonCheckService personCheckService;

    public PlayerManager(BaseRepository<Player> baseRepository, PersonCheckService personCheckService) {
        this.baseRepository = baseRepository;
        this.personCheckService = personCheckService;
    }

    @Override
    public void add(Player player) {

        try {
            if (personCheckService.checkIfRealPerson(player)) {
                baseRepository.add(player);
            }else{
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Player player) {
        try {
            if (personCheckService.checkIfRealPerson(player)) {
                baseRepository.update(player);
            }else{
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Player player) {
        getByPlayerId(player.getId()).ifPresent(player1 -> baseRepository.delete(player));

    }

    @Override
    public Optional<Player> getByPlayerId(int id) {
        return baseRepository.getById(id);
    }

    @Override
    public List<Player> getAll() {
        return baseRepository.getAll();
    }
}
