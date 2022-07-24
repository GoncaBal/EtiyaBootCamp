package business.abstracts;

import entities.concretes.Player;

public interface PersonCheckService {
    boolean checkIfRealPerson(Player player) throws Exception;
}
