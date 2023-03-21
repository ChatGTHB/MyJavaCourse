package homework._05_01_2023_06_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Kare kare=new Kare();
        Dikdortgen dikdortgen=new Dikdortgen();

        System.out.println("Kare Alan = " + kare.alanHesapla(7));
        System.out.println("Dikdörtgen Alan = " + dikdortgen.alanHesapla(5, 8));

        System.out.println("Kare Çevre = " + kare.cevreHesapla(7));
        System.out.println("Dikdörtgen Çevre = " + dikdortgen.cevreHesapla(5, 8));



    }
}
