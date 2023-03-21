package gun35._03_Polymorphism_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public static void kimlikBelgesiOlustur(Kisi kisi) {

        if (kisi instanceof Calisan) {
            System.out.println("Çalışan = " + ((Calisan) kisi));
        } else if (kisi instanceof Ogrenci) {
            System.out.println("Öğrenci = " + ((Ogrenci) kisi));
        } else {
            System.out.println("Kişi = " + kisi);
        }
    }
}
