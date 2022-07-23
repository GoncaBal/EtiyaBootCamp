public class ProductManager {
    public void add(Product product) {
        System.out.println("Ürün eklendi : " + product.getName());
    }


    public void update(Product product) {
        System.out.println("Ürün güncellendi : " + product.getName());
    }
}
