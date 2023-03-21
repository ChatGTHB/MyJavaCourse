package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.HashSet;

public class _Sets_2D_ArrayList_Odev_01 {
    public static void main(String[] args) {
        //1-
        // Create a method totalCount()
        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(7);

        System.out.println(totalCount(hashSet));
    }

    public static int totalCount(HashSet<Integer> hashSet) {

        int count = 0;
        for (int sayi : hashSet) {
            count++;
        }
        return count;
    }
}

