package gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner input = new Scanner(System.in);
        System.out.print("Ağırlığınızı kilogram cinsinden giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        double boy = input.nextDouble();

        double kitleIndex = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz = " + kitleIndex);


    }
}
