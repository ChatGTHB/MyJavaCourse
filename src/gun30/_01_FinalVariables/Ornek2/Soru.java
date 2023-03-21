package gun30._01_FinalVariables.Ornek2;


import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.
        Scanner input = new Scanner(System.in);

        System.out.print("Gün : ");int gun = input.nextInt();
        System.out.print("Saat : ");int saat = input.nextInt();
        System.out.print("Dakika : ");int dakika = input.nextInt();
        System.out.print("Saniye : ");int saniye = input.nextInt();

        System.out.println(Sabitler.saniyeHesapla(gun, saat, dakika, saniye));
    }
}
