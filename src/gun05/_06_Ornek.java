package gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulup, yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.print("Cevresini ve alanini hesaplamak istediginiz karenin bir kenar uzunlugunu giriniz : ");
        int kenar=input.nextInt();
        int cevre=4*kenar;
        int alan=kenar*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
