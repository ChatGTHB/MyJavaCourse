package gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        // kisi1.ad="Yiğit";
        // kisi1.soyad="Koçak";
        // kisi1.yas=-25;
        kisi1.setAd("Yiğit");
        kisi1.setSoyad("Koçak");
        kisi1.yasAta(-25);
        kisi1.yasAta(37);

        System.out.println("kisi1.yasVer() = " + kisi1.yasVer());
        System.out.println("kisi1.getAd() = " + kisi1.getAd());
        System.out.println("kisi1.getSoyad() = " + kisi1.getSoyad());

        System.out.println("kisi1 = " + kisi1);

        // değişkene direkt erişimi kapatıp
        // bir metot ile korumalı veri gönderme ve alma
        // işlemine Encapsulation denir.
    }
}
