package homework._08_12_2022_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Odev_6 {
    public static void main(String[] args) {
        //6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        diziyiTerstenYazdir();
    }

    public static void diziyiTerstenYazdir(){
        Scanner input=new Scanner(System.in);

        System.out.print("Oluşturacağınız dizinin uzunluğunu giriniz : ");
        int diziLength= input.nextInt();

        int dizi[]=new int[diziLength];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Diziniz için bir sayı giriniz : ");
            dizi[i]=input.nextInt();
        }
        System.out.println("Girilen Dizi = "+Arrays.toString(dizi));

        System.out.print("Tersten Dizi = ");
        for (int i = (dizi.length-1); i >=0 ; i--) {
            System.out.print(dizi[i]+"  ");
        }
    }

}
