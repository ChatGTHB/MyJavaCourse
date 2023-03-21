package homework._13_12_2022_Sets_2D_ArrayList;

import java.util.LinkedHashSet;
public class _Sets_2D_ArrayList_Odev_04 {
    public static void main(String[] args) {
    //  4-
    //  removing() isminde bir method oluşturun.
    //  Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    //  Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    //  Return tipi linkedhashset
    //  Örneğin,
    //  linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    //  String 1= Germany
    //  String 2 = USA
    //   **Germany ve USA 'i sil.**
    //  Set'i döndür.

        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("Germany");
        lhs.add("France");
        lhs.add("USA");
        lhs.add("Canada");
        lhs.add("Mexico");
        lhs.add("Brazil");
        String str1 = "Germany";
        String str2 = "USA";
        System.out.println(removing(lhs, str1, str2));
    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String str1, String str2) {
        lhs.remove(str1);
        lhs.remove(str2);

        return lhs;

    }
}
