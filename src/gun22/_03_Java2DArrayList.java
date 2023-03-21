package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(40);
        matNotlari.add(50);
        matNotlari.add(60);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);
        kimNotlari.add(100);

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();

        notlarListesi.add(matNotlari);
        notlarListesi.add(kimNotlari);
        notlarListesi.add(fizNotlari);

        ArrayList<String> dersler = new ArrayList<>();

        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.print(dersler.get(i) + " : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        System.out.println("********************************************************************");

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.


        Scanner input = new Scanner(System.in);
        System.out.print("Notlarını istediğiniz dersin nosunu giriniz. " +
                "(0-Mat, 1-Fiz, 2-Kim)" + " : ");
        int dersKodu = input.nextInt();

        dersNotlariniYazdir(notlarListesi, dersKodu);

        //Soru-3:
        // Yukarıda verilen derse ait not ortalamasını ve geçen sayısını bir metotta yazdırınız.
        System.out.println();
        ortalamaVeGecenSayisiniYazdir(notlarListesi, dersKodu);
    }

    public static void ortalamaVeGecenSayisiniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersKodu) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersKodu).size(); i++) {
            toplam += notlarListesi.get(dersKodu).get(i);
        }
        int ortalama = toplam / notlarListesi.get(dersKodu).size();
        int gecenMiktar = 0;
        for (int i = 0; i < notlarListesi.get(dersKodu).size(); i++) {
            if (notlarListesi.get(dersKodu).get(i) >= ortalama) {
                gecenMiktar++;

            }
        }
        System.out.println("Ortalama = " + ortalama);
        System.out.println("Geçen Miktar = " + gecenMiktar);

    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersKodu) {

        for (int i = 0; i < notlarListesi.get(dersKodu).size(); i++) {
            System.out.print(notlarListesi.get(dersKodu).get(i) + "\t");
        }
    }
}
