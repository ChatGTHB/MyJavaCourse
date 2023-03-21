package gun35._03_Polymorphism_Soru;
public class OkulMain {
    public static void main(String[] args) {

       Calisan calisan=new Calisan("Kerem","Yiğit","Muhasebeci","Muhasebe");
       Ogrenci ogrenci=new Ogrenci("Said","Yılmaz","Öğrenci","5A");

        Kisi.kimlikBelgesiOlustur(calisan);
        Kisi.kimlikBelgesiOlustur(ogrenci);

    }
}
