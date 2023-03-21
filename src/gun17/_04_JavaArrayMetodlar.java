package gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler = {"ahmet", "zeynep", "roman", "yasin", "cihan"};

        //Diziyi String olarak direkt yazdırır
        System.out.println("İsimler = " + Arrays.toString(isimler));//İsimler = [ahmet, zeynep, roman, yasin, cihan]

        //Dizi Sıralama
        Arrays.sort(isimler);
        System.out.println("İsimler = " + Arrays.toString(isimler));//İsimler = [ahmet, cihan, roman, yasin, zeynep]

        //Diziler eşit mi?
        int[] a = {1, 8, 3, 54};
        int[] b = {1, 8, 3, 54};
        int[] c = {1, 8, 2, 54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));//true
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, c));//false

        Arrays.sort(c);//Sayı bazlı dizi sıralaması
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));//[1, 2, 8, 54]

        // contains gibi çalışır, aranan var ise pozitif bir değer döndürür, yoksa negatif
        // sıralı olmazsa, aranan aralarda olursa doğru sonuç vermez.
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));// -2
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));// 1

        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
        System.out.println("Arrays.binarySearch(b,4) = " + Arrays.binarySearch(b, 4));// -3
        // aranan eleman yoksa, olması halinde hangi indexte olacaktı idiyse o indexin 1 fazlasının
        // -(eksi) değeri olarak döndürüyor.


    }
}
