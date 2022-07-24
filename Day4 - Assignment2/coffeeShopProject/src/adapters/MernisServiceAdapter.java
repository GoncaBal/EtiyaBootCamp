package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import mernisReferance.IACKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        IACKPSPublicSoap client = new IACKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getBirthOfDate());

    }
}
