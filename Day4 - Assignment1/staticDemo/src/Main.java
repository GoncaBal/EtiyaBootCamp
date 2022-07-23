import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
ProductManager productManager=new ProductManager();
Product product1=new Product();
product1.name="Maouse";
product1.price=10;
productManager.add(product1);

DatabaseHelper.crud.delete();
DatabaseHelper.connection.createConnection();
    }
}
