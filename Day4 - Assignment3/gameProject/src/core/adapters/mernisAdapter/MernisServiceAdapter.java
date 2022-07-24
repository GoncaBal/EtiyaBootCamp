package core.adapters.mernisAdapter;

import business.abstracts.PersonCheckService;
import entities.concretes.Player;
import mernisReferance.TJCKPSPublicSoap;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        TJCKPSPublicSoap client = new TJCKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.valueOf(player.getIdentityNumber()),player.getFirstName().toUpperCase(),
                    player.getLastName().toUpperCase(),player.getBirthOfYear());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
