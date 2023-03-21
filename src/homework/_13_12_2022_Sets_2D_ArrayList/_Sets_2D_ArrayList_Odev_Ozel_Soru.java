package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.HashSet;

public class _Sets_2D_ArrayList_Odev_Ozel_Soru {
    public static void main(String[] args) {
    //  Özel Soru:
    //
    //  6-
    //  Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
    //  random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar (20 dahil olarak değerlendirildi) olan
    //  sayılarla doldurunuz. Seti main de yazdırınız.

        HashSet<Integer>hs=new HashSet<>();
        System.out.println(hashSetDoldur(hs));
    }

    public static HashSet<Integer> hashSetDoldur(HashSet<Integer> hashSet) {
        while (hashSet.size()<10){
            hashSet.add((int)(Math.random()*20)+1);
        }
        return hashSet;
    }
}
