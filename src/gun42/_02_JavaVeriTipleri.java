package gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel (primitive )tipler : short, byte, long, float, double, boolean, int
        int sayi1 = 5;
        int sayi2 = 10;

        sayi1 = sayi2; // sayi1=10 // eşitlesen değerler atanır,
                      // kendi hücreleri yine ayrı ayrı kalır.
         sayi1=34;
         sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Referans Tipler : classlar, diziler, arraylar, nesneler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};

        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); // 5,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); // 5,6

        dizi1[0]=67;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); // 67,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); // 67,6

        dizi2[0]=55;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); // 55,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); // 55,6

        // Nesne Tipler : NULL alabilen ilkel tip
        // String, Integer, Double, Long
        String ad1="Kerem";
        String ad2="Said";
        // Referans ama davaranışı ilkel

        ad1=ad2;
        System.out.println("ad1 = " + ad1); // Said farklı kutucuk
        System.out.println("ad2 = " + ad2); // Said farklı kutucuk

        ad1="Mustafa";
        System.out.println("ad1 = " + ad1); // Mustafa
        System.out.println("ad2 = " + ad2); // Sais

    }
}
