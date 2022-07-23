public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Dell Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product product2=new Product(2,"Laptop","Asus Laptop",5500,5);

        ProductManager productManager=new ProductManager();
        productManager.add(product2);
        System.out.println(product2.getKod());
    }
}
