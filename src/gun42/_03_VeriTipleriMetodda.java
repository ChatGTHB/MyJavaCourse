package gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        // İlkel Tipler
        int sayi=5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi); // 5

        // Nesne Tipler
        String kelime="Kerem";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);

        // Referans Tipler
        int[]dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.
    }

    private static void diziSifirla(int[] dizi) { // referans değerlerin kendisi gelir
        dizi[0]=0; dizi[1]=0; dizi[2]=0;
    }

    private static void kelimeSifirla(String kelime) { // değeri gelir
        kelime="";
    }

    private static void sayiArtir(int sayi) { // ilkel değerlerin değeri gelir
        sayi++;
    }
}
