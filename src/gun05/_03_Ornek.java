package gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz : ");
        String adSoyad=input.nextLine();
        System.out.println("adSoyad = " + adSoyad);


    }
}
