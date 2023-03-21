package gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayının toplamının sonucunu yazdırınız.

        Scanner input = new Scanner(System.in);

        int sayac = 1;
        int toplam = 0;

        while (sayac <= 20) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            System.out.println(number);
            sayac++;
            toplam += number;

            System.out.println("Subtotal = " + toplam);
        }
        System.out.println("Total = " + toplam);

    }
}
