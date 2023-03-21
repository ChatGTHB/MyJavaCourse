package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.HashSet;

public class _Sets_2D_ArrayList_Odev_02 {
    public static void main(String[] args) {

        //  2-
        //  changeSet() isminde bir method oluşturun.
        //  Parametre olarak bir String HashSet   ve  iki String
        //  return hashset olmalı
        //  Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //  **ÖRNEK:**
        //  hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //  String 1 = **banana**
        //  String 2 = **peach**
        //  **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> meyveSepeti = new HashSet<>();
        meyveSepeti.add("banana");
        meyveSepeti.add("strawberry");
        meyveSepeti.add("kiwi");
        meyveSepeti.add("pineapple");
        String meyve1 = "banana";
        String meyve2 = "peach";
        System.out.println(changeSet(meyveSepeti, meyve1, meyve2));
    }

    public static HashSet<String> changeSet(HashSet<String> meyveSepeti, String meyve1, String meyve2) {

        if (meyveSepeti.contains(meyve1)) {
            meyveSepeti.remove(meyve1);
            meyveSepeti.add(meyve2);
        }

        return meyveSepeti;
    }

}
