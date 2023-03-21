// 01_12_2022_Homework

package gun17;

import java.util.Arrays;
public class _06_01_12_2022_Homework {
    public static void main(String[] args) {


/* 1- Bu String'i oluşturun. "Removes white space from both ends of a string"
      String'deki kelime sayısını yazdırınız.*/

        String sentence = ("Removes white space from both ends of a string");

        String[] words = sentence.split(" ");

        int wordCount = words.length;

        System.out.println("Word Count = " + wordCount);

/* 2- Bir String oluşturun : "Hello World" Stringi tersten yazdırın ve print edin.
      _Cevap böyle olmalı :  "dlroW olleH"_ */

        String hello = "Hello World";

        String reverseHello = "";

        for (int i = hello.length() - 1; i >= 0; i--) {
            reverseHello += hello.charAt(i);
        }

        System.out.println("reverseHello = " + reverseHello);

/* 3- İnt Array oluştur ve elemanları   : 25,30,30,35,100
      Array in elemanlarının toplamını yazdır.
      Cevap 220 olmalı. */

        int[] array3 = {25, 30, 30, 35, 100};

        int total = 0;

        for (int i = 0; i < array3.length; i++) {
            total += array3[i];
        }

        System.out.println("Total = " + total);

// 4- int Array oluşturun. Elemanları : 13,15,14,16,16. Arrayin elemanlarını yazdırın.

        int[] array4 = {13, 15, 14, 16, 16};

        System.out.println("array4 = " + Arrays.toString(array4));


/* 5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
      Array'daki eleman sayısını yazdırınız. Cevap 4 olmalı. */

        String[] array5 = {"new jersey", "new york", "boston", "California"};

        System.out.println("array5.length = " + array5.length);


/* 6- String Array (Dizi) oluşturunuz. Elemanları : Apple, Orange , Banana, Kiwi
      Tüm elemanları yazdırınız. */

        String[] array6 = {"Apple", "Orange", "Banana", "Kiwi"};

        System.out.println("array6 = " + Arrays.toString(array6));

// 7- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4. Array'in ortalamasını alınız.

        int array7[] = {12, 14, 21, 23, 10, 4};

        double average = 0;

        int k = 0;

        for (k = 0; k < array7.length; k++) {
            average += array7[k];
        }
        average /= k;

        System.out.println("array7 average = " + average);

        /* 8- int Array oluşturun ve elemanları : 5,6,8,12,14,19 olsun. Eğer sayı çiftse topla, tekse çıkar.
         **Örneğin:**      **-5 + 6 + 8 + 12 + 14 - 19 = 16**     Toplamlarını yazdırın. */

        int[] array8 = {5, 6, 8, 12, 14, 19};

        int total8 = 0;

        for (int i = 0; i < array8.length; i++) {
            if (array8[i] % 2 != 0) {
                total8 -= array8[i];
            } else {
                total8 += array8[i];
            }
        }
        System.out.println("Total = " + total8);

/* 9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30.
      Arraydaki en büyük 2. elemanı yazdıran bir program yazın. */

        int[] array9 = {15, 25, 22, 18, 30};

        Arrays.sort(array9);

        System.out.println("Second largest element in array9 = " + array9[array9.length - 2]);

/* 10- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21 olsun.
       En küçük (minimum) sayıyı yazdırınız. */

        int[] array10 = {14, 19, 5, 21};

        Arrays.sort(array10);

        System.out.println("array10 minimum number = " + array10[0]);

/* 11- int Array oluşturun ve elemanları : 12,2,5,15,8 olsun.
       En büyük değeri yazdırınız. */

        int[] array11 = {12, 2, 5, 15, 8};

        Arrays.sort(array11);

        System.out.println("array11 maximum value = " + (array11[array11.length - 1]));


/* 12- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple olsun.
      Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
      Eğer aitse "true" çevirin.  Loops (döngüler) kullanın. */

        String[] array12 = {"Apple", "Orange", "Banana", "Pineapple"};

        boolean isThere = false;

        for (int i = 0; i < array12.length; i++) {
            if (array12[i].equals("Apple")) {
                isThere = true;
                break;
            }
        }

        System.out.println("isThere = " + isThere);


/* 13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
       $ işaretlerini kaldırın ve sayıları toplayın. Sayıların toplamını yazdırın. */

        String dollars = "$12 $23 $10 $2 $5 $2";
        String[] array13= dollars.split(" ");
        int total13 = 0;

        for (int i = 0; i < array13.length; i++) {
            array13[i] = array13[i].replace("$", "");
            total13 += Integer.parseInt(array13[i]);
        }
        System.out.println("Total = " + total13);

    }
}
