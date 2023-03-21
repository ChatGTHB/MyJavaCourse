package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class _Sets_2D_ArrayList_Odev_03 {
    public static void main(String[] args) {
        //  3-
        //  commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //  return tipi arraylist olmalı.
        //  **ÖRNEĞİN:**
        //  İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //  İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //  Ortak değerleri ArrayListe ekleyiniz.
        //  çıktı:  "Germany" , "Brazil" ,"USA"
        //  ArrayListi yazdırınız.

        HashSet<String> ulkeler1 = new HashSet<>();
        ulkeler1.add("Germany");
        ulkeler1.add("England");
        ulkeler1.add("South Africa");
        ulkeler1.add("Brazil");
        ulkeler1.add("USA");

        HashSet<String> ulkeler2 = new HashSet<>();
        ulkeler2.add("Germany");
        ulkeler2.add("China");
        ulkeler2.add("Brazil");
        ulkeler2.add("France");
        ulkeler2.add("USA");

        System.out.println(commonValues(ulkeler1, ulkeler2));

    }
    public static ArrayList<String> commonValues(HashSet<String> ulkeler1, HashSet<String> ulkeler2) {

        ulkeler1.retainAll(ulkeler2);

        ArrayList<String> ortakUlkeler = new ArrayList<>(ulkeler1);

        return ortakUlkeler;
    }
}
