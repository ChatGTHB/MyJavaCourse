package gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
        //Ogrenci ogrenci1=new Ogrenci("Kerem","Sunguroğlu","Fevzi Çakmak İlköğretim Okulu");
        //Ogrenci ogrenci2=new Ogrenci("Kaan","Yiğtoğlu","Fevzi Çakmak İlköğretim Okulu");
        //Ogrenci ogrenci3=new Ogrenci("Kerim","Beydağı","Fevzi Çakmak İlköğretim Okulu");
      //  //...
      //  //...
      //  Ogrenci ogrenci499=new Ogrenci("Tuğser","Sunguralp","Fevzi Çakmak İlköğretim Okulu");
      //  Ogrenci ogrenci500=new Ogrenci("Kazım","Yeneroğlu","Fevzi Çakmak İlköğretim Okulu");

        Ogrenci ogrenci1=new Ogrenci("Kerem","Sunguroğlu");
        System.out.println("ogrenci1 = " + ogrenci1);

        Ogrenci.okulAd="Yeşilbayır İlköğretim Okulu";
        System.out.println("ogrenci1 tekrar = " + ogrenci1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
    }
}
