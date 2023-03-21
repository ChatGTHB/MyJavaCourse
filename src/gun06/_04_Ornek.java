package gun06;

import java.util.Scanner;

// Girilen bir Stringin sadece son harfini yazdırınız
public class _04_Ornek {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String ifade= input.nextLine();
        char sonHarf= ifade.charAt(ifade.length()-1);

        System.out.println("sonHarf = " + sonHarf);

    }
}
