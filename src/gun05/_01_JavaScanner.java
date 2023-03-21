package gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        int sayi=5;

        Scanner input= new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        sayi=input.nextInt();
        System.out.println("sayi = " + sayi);

    }
}
