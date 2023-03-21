package gun20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

       Scanner input=new Scanner(System.in);

       System.out.print("1.Sayı = ");
       int sayi1=input.nextInt();

       System.out.print("2.Sayı = ");
       int sayi2=input.nextInt();

       System.out.println(enBul(sayi1, sayi2));


    }

    public static int enBul(int a, int b) {
        int donecek = 0;
        if (a > b) {
            donecek = a;
        } else {
            donecek = b;
        }
        return donecek;
    }
}
