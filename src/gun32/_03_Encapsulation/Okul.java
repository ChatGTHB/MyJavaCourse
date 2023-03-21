package gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private static int kontenjan;
    private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public static void ogrenciEkle(Ogrenci ogrenci) {
        if (ogrenci.getYas() <= 15 && ogrenciler.size() < kontenjan) {
            ogrenciler.add(ogrenci);
            System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad()+
                    " başarıyla eklendi."+
                    "\nMevcut öğrenci sayısı : " + ogrenciler.size());
            if (ogrenciler.size() == kontenjan) {
                System.out.println("Kontenjan doldu.");
            }
        } else if (ogrenci.getYas() > 15) {
            System.out.println("Öğrencinin yaşı 15'ten büyük " +
                    "olduğundan ekleme yapılamadı. " +
                    "Başka öğrenci ekleyiniz.");
        } else if (ogrenciler.size() == kontenjan) {
            System.out.println("Kontenjan dolduğundan ekleme yapılamadı.");
        }
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        Okul.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        Okul.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
