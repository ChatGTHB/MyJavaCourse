package gun10;

import java.util.Scanner;

public class _08_IfElse_21_11_2022_Homework {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner input = new Scanner(System.in);

        System.out.print("İki boşluk ve sayılar içeren bir ifade giriniz : ");
        String sayilar = input.nextLine();

        int ilkBoslukIndex = sayilar.indexOf(" ");
        int sonBoslukIndex = sayilar.lastIndexOf(" ");

        String strSayi1 = sayilar.substring(0, ilkBoslukIndex);
        String strSayi2 = sayilar.substring(ilkBoslukIndex + 1, sonBoslukIndex);
        String strSayi3 = sayilar.substring(sonBoslukIndex + 1);

        int sayi1 = Integer.parseInt(strSayi1);
        int sayi2 = Integer.parseInt(strSayi2);
        int sayi3 = Integer.parseInt(strSayi3);

        if ((sayi1 + sayi2 + sayi3) % 2 != 0)
            System.out.println("Tek sayı");
        else System.out.println("Çift sayı");


    }
}
