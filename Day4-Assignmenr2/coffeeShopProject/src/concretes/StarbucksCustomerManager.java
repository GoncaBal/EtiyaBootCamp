package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        {
            if (customerCheckService.checkIfRealPerson(customer)) {
                System.out.println("Save to db : " + customer.getFirstName());

            } else {
                System.out.println("Not a valid person");
            }
        }
    }
}
