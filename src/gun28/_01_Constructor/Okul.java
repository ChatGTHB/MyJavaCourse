package gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        // 1.Yol
        Ogrenci ogr1=new Ogrenci();// nesne oluşma anı,

        ogr1.id=1;// özelliklerinin değerlerini veriyorum
        ogr1.ad="Kerem";
        ogr1.soyad="Gunduzalp";
        ogr1.sinifi=2;
        System.out.println("ogr1.ad = " + ogr1.ad);

        // 2.Yol
        Ogrenci ogr2=new Ogrenci(2,"Said","Gunduz",2);
        System.out.println("ogr2.ad = " + ogr2.ad);

        Ogrenci ogr3=new Ogrenci(2,"Kasım","Kayaalp");
        System.out.println("ogr3.ad = " + ogr3.ad);
    }
}
