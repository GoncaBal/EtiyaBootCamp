public class Main {
    public static void main(String[] args) {
        KrediUI krediUI=new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
    }
}
