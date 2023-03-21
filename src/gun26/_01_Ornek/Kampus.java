package gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr = new Ogrenci();

        ogr.okulNo = 1;
        ogr.tamAd = "Hakan Taşören";

        // 1. Yöntem
        ogr.okulu = new Okul();
        ogr.okulu.adi = "Şair Hayri Lisesi";
        ogr.okulu.mudurAdi = "Tuncay Yerebasmaz";
        ogr.okulu.ucreti = 55555;

        // 2. Yöntem
        Okul ok = new Okul();
        ok.adi = "Şait Hayri Lisesi";
        ok.mudurAdi = "Tuncay Yerebasmaz";
        ok.ucreti = 55555;
        ogr.okulu = ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("ogr.okulu.adi = " + ogr.okulu.adi);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr.okulu.ucreti = " + ogr.okulu.ucreti);


    }
}
