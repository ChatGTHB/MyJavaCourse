package gun16;

import java.util.Arrays;
import java.util.HashSet;
public class _06_Todo {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[] kanallar = {"A1", "B2", "C3", "D4", "E5"};
        int random = (int) (Math.random() * kanallar.length);
        System.out.println(kanallar[random]);

        // TODO : Günün Sorusu :
        //  Bir döngü ile 5 tane rastgele buldurunuz fakat bir bulduğunu bir daha bulmasın.

        HashSet<String> tekrarsizYazdir = new HashSet<>();

        for (int i = 0; i < kanallar.length; i++) {
            random = (int) (Math.random() * kanallar.length);
            tekrarsizYazdir.add(kanallar[random]);
        }
        System.out.println("tekrarsizYazdir = " + tekrarsizYazdir);

    }
}




