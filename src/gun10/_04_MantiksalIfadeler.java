package gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal İfadeler
        // && ve
        // || veya

        //Girilen sayı pozitif ve tek ise, ekrana "uygun sayı girildi"
        //değilse "uygun sayı girilmedi" yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        if (sayi > 0 && sayi % 2 != 0)
            System.out.println("Uygun sayı girildi.");
        else System.out.println("Uygun sayı girilmedi.");

    }
}
