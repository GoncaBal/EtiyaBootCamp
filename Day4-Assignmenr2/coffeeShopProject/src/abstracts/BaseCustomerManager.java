package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public abstract void save(Customer customer) throws Exception;
}
