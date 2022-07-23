public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
     static{
         System.out.println("Statik yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
        }
    public void bisey(){

    }
    //Inner Class
    public static class AnotherClass{
        public static void delete(){

        }
    }
}
