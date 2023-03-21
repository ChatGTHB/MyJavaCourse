package gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimi - >  if
        // Girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız.
        // Algoritma
        //1 - Başla   {
        //2 - sayi oku  sayi=oku.nextInt()
        //3 - sayi > 10 ise "10 dan büyük" yaz ->   if (sayi > 10) sout....
        //4 - Dur

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi= input.nextInt();

        if(sayi>10){
            System.out.println("10'dan büyük");
        }

    }
}
