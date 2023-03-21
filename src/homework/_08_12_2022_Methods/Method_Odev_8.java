package homework._08_12_2022_Methods;

import java.util.Arrays;

public class Method_Odev_8 {
    public static void main(String[] args) {

//   8- append adında bir method oluşturun.`
//`     Parametre olarak iki int array  oluşturun.`
//      ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//      Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//      Bunu döndürmelidir:
//      {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] dizi1 = {2, 4, 6};
        int[] dizi2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(append(dizi1, dizi2)));

    }

    public static int[] append(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        int j = 0;
        for (int i = array1.length ; i < array1.length + array2.length; i++) {
            array3[i] = array2[j];
            j++;
        }
        array1 = array3;

        return array1;
    }
}
