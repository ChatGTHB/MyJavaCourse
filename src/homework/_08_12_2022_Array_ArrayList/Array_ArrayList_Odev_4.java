package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;

public class Array_ArrayList_Odev_4 {
    public static void main(String[] args) {

        //  4- Bir tane 2d array[][] oluşturun ve elemanları =  [  [1, 2, 3 ],  [4, 5, 6 ],  [7, 8, 9 ] ]
        //     Tüm elemanları bir arrayListe yükleyin ve bu arrayList 'i yazdırın.
        //     **Örnek:**
        //     **Girdi:** [ [1, 2, 3 ], [4, 5, 6 ], [7, 8, 9 ]
        //     **Çıktı:** [1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[][] array4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> arrayList4 = new ArrayList<>();

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                arrayList4.add(array4[i][j]);
            }
        }
        System.out.println("arrayList4 = " + arrayList4);
    }
}
