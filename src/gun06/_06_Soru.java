package gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Ismet Temur"  I.T.  şeklinde yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad=input.nextLine();
        System.out.print("Soyadınızı giriniz : ");
        String soyAd=input.nextLine();

        char adBasharf=ad.charAt(0),soyAdBasHarf=soyAd.charAt(0);

        System.out.println(adBasharf+"."+soyAdBasHarf+".");

    }
}
