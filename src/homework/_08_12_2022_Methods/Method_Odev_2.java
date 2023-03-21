package homework._08_12_2022_Methods;

public class Method_Odev_2 {
    public static void main(String[] args) {

// 2- "OrtaKelime" isminden bir method oluşturun.
//     Bu method String'i parametre olarak almalı.
//     Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//     Ortadaki kelimeyi return yapınız.
//     Örnek: Ben Java'yı seviyorum.
//     print : Java'yı
//     Örnek2: Java'yı kolayca öğreniyorum.
//     print: kolayca

        System.out.println(ortaKelime("Java'yı kolayca öğreniyorum."));
    }
    public static String ortaKelime(String cumle) {
        String[] kelimeler = cumle.split(" ");

        return kelimeler[kelimeler.length / 2];
    }
}
