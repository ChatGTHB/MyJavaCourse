package gun06;

// Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde adres bilgisi alarak yazdırınız.

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Scanner inputInt=new Scanner(System.in);

        System.out.print("Oturduğunuz caddeyi giriniz : ");
        String cadde = input.nextLine();
        System.out.print("Oturduğunuz sokağı giriniz : ");
        String sokak = input.nextLine();
        System.out.print("Oturduğunuz ülkeyi giriniz : ");
        String ulke = input.nextLine();
        System.out.print("Posta kodunuzu giriniz : ");
        int postaKodu= inputInt.nextInt();

        String adres= cadde+" caddesi, "+sokak+" sokağı, posta kodu : "+postaKodu+" "+ulke;
        System.out.println("Adres : " + adres);


    }
}
