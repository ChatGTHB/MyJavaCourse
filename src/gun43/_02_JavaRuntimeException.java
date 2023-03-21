package gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program başladı.");

        for (int i = 0; i < 3; i++) {

            try { // Hata bölgesini try {}'ine aldık
                Scanner input = new Scanner(System.in);

                System.out.print("Sayi1 = ");
                int sayi1 = input.nextInt();

                System.out.print("Sayi2 = ");
                int sayi2 = input.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);

            } catch (Exception hata) {
                // Hata mesajlarını hata isimli Exception cinsinden değişkene attık
                System.out.println("hata = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }
        }
        System.out.println("Program bitti.");
    }
}
