package gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] sayilar = new int[7];

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Sayı giriniz : ");
            sayilar[i] = input.nextInt();
            toplam += sayilar[i];
        }

        int ortalama = toplam / sayilar.length;

        int tekOrtUstuSayi = 0;


        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > ortalama && sayilar[i] % 2 != 0) {
                tekOrtUstuSayi++;
            }
        }
        System.out.println("Toplam = " + toplam);
        System.out.println("Ortalama = " + ortalama);
        System.out.println("Ortalamadan büyük ve tek sayı adedi = " + tekOrtUstuSayi);
    }
}
