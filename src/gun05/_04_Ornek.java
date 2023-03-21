package gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner input=new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad=input.nextLine();
        System.out.print("Soyadınızı giriniz : ");
        String soyad=input.nextLine();
        System.out.println("Adınız ve soyadınız : "+ad+" "+soyad);
    }
}
