package gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç diğerlerini toplasın.

        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number :");
            int number = input.nextInt();

            if (number > 6 && number < 10) {
                continue;//çalıştığında döngüde kendisinden sonra gelen komutları pas geçirir.
            }
            total += number;
            System.out.println("Subtotal = " + total);
        }
        System.out.println("Total = " + total);

        /*BREAK ve CONTINUE
        Döngüleri etkiler
        if şartı ile çalışır
        Break döngüyü kırar.
        Continue ise sadece o adımı
        pass geçirir.döngü devam eder
         */


    }
}
