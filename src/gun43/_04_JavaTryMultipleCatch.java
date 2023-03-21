package gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program başladı.");


        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Sayi1 = ");
            int sayi1 = input.nextInt();

            System.out.print("Sayi2 = ");
            int sayi2 = input.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("Bölüm = " + bolum);

            // String kelime=""; // Genel hataya düşmesi için yapıldı.
            // kelime.charAt(3);

        } catch (InputMismatchException ex) { // Belirli bir hata
            System.out.println("Lütfen bir sayı giriniz.");
        } catch (ArithmeticException ex) { // Belirli bir hata
            System.out.println("Sıfıra bölme hatası.");
        } catch (Exception ex) { // Yukarıdakilerin dışındaki hatalar için
            System.out.println("Hata oluştu. " + ex.getMessage());
        }

        System.out.println("Program bitti.");
    }
}
