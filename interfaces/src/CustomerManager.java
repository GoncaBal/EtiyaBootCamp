public class CustomerManager {
    CustomerDal customerDal;
    public CustomerManager(CustomerDal customerDal){
       this.customerDal=customerDal;
    }
    public void add(){
        //iş kodları
        customerDal.add();
    }
}
