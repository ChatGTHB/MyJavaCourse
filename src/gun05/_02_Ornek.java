package gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad = input.nextLine();
        System.out.println("ad = " + ad);

    }
}
