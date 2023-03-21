package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.ArrayList;

public class _Sets_2D_ArrayList_Odev_05 {
    public static void main(String[] args) {
//  5-
//  2D ArrayList
//  Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//  Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//  **Örnek:**
//  **Girdi:**
//  [
//  [ 1, 2, 3 ],
//  [ 4, 5, 6 ],
//  [ 7, 8, 9 ]
//  ]
//  **Çıktı:** [1,2,3,4,5,6,7,8,9]
//  ```

        int [][] dizi={{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                list.add(dizi[i][j]);
            }
        }
        System.out.println("list = " + list);
    }
}
