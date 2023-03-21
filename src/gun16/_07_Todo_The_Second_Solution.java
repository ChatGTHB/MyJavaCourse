package gun16;

import java.util.HashSet;

public class _07_Todo_The_Second_Solution {
    public static void main(String[] args) {

        // The Second Solution

        // TODO : Günün Sorusu :
        //  Bir döngü ile 5 tane rastgele buldurunuz fakat bir bulduğunu bir daha bulmasın.

        String[] kanallar = {"A1", "B2", "C3", "D4", "E5","F6","G7","H8","K9","L10"};
        int random = (int) (Math.random() * kanallar.length);

        HashSet<String> tekrarsizYazdir = new HashSet<>();

        while (tekrarsizYazdir.size()<5) {
            random = (int) (Math.random() * kanallar.length);
            tekrarsizYazdir.add(kanallar[random]);
        }
        System.out.println("tekrarsizYazdir = " + tekrarsizYazdir);

    }
}
