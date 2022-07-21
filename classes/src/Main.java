public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
       customerManager1=customerManager2;

        customerManager1.add();
        customerManager1.update();
        customerManager1.delete();
    }
}
