public class Main {
    public static void main(String[] args) {
        int sayi=topla(5,7);
        System.out.println(sayi);
        int sayi2=topla(1,2,3,4,5,6,7);
        System.out.println(sayi2);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    //variable arguments int... şeklinde olan yazım
    //denetlenebilirliği zayıflattığı için nesnelerle
    // çalışırken zaafiyet yaratabilir

    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
}
