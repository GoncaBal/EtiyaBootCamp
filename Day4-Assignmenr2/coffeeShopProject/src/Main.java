import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
       // BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager customerManager= new NeroCustomerManager();
        customerManager.save(new Customer(1,"Gonca","Bal",1994,"13510471338"));
    }
}
