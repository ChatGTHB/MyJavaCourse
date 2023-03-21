package gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulup yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Kisa kenar uzunlugunu giriniz :");
        int kisaKenar = input.nextInt();
        System.out.print("Uzun kenar uzunlugunu giriniz :");
        int uzunKenar = input.nextInt();

        int cevre = 2 * (kisaKenar + uzunKenar);
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
