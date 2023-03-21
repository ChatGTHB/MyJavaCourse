package gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve
        // ortalamadan büyük kaç not olduğunu bulunuz ve
        // bunları yazdırınız.

        int[] notlar = new int[50];

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu giriniz : ");
            notlar[i] = input.nextInt();
            toplam += notlar[i];
        }
        System.out.println("Toplam = " + toplam);

        int ortalama = toplam / notlar.length;

        int ortUstuSayi = 0;

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] > ortalama) {
                System.out.println("Ortalamadan büyük not = " + notlar[i]);
                ortUstuSayi++;
            }
        }
        System.out.println("Ortalama = " + ortalama);
        System.out.println("Ortalama Üstü Sayılar = " + ortUstuSayi + " tanedir.");


    }
}
