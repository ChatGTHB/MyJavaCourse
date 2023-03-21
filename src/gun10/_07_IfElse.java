package gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı ve boşluk içeren bir ifade giriniz : ");
        String sayilar = input.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex);
        String strSayi2=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);



        if (sayi1 == sayi2)
            System.out.println("Eşit");
        else System.out.println("Eşit değil");


    }
}
