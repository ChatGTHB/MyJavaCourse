package gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        IlkOgrencisi ogrenci1 = new IlkOgrencisi("Yakup Vuslateri", Tip.ILK, "İzcilik");
        IlkOgrencisi ogrenci2 = new IlkOgrencisi("Yusuf Yakupoğlu", Tip.ILK, "Fotografçılık");
        LiseOgrencisi ogrenci3 = new LiseOgrencisi("Said Gezer", Tip.LISE, "TM");

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("ogrenci2 = " + ogrenci2);
        System.out.println("ogrenci3 = " + ogrenci3);
    }
}