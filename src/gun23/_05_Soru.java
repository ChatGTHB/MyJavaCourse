package gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

        Integer[] sayilar = new Integer[10];

        HashSet<Integer> tekrarsizYazdir = new HashSet<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 11);
            tekrarsizYazdir.add(sayilar[i]);
        }
        System.out.println("sayilar = " + Arrays.toString(sayilar));
        System.out.println("Tekrarsız Sayılar = " + tekrarsizYazdir);


        // 2. yöntem

        HashSet<Integer> tekrarsizYazdir2 = new HashSet<>(Arrays.asList(sayilar));
        System.out.println("Tekrarsız Sayılar 2 = " + tekrarsizYazdir2);

        // 3. yöntem

        HashSet<Integer>tekrarsizYazdir3=new HashSet<>();
        Collections.addAll(tekrarsizYazdir3,sayilar);
        System.out.println("Tekrarsız Sayılar 3 = " + tekrarsizYazdir3);


    }
}
