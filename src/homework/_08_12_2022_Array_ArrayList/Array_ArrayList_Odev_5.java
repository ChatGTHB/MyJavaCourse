package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;

public class Array_ArrayList_Odev_5 {
    public static void main(String[] args) {
        //  5- ismi getCount() olan bir method oluşturun.
        //  Parametre olarak bir String ArayList  ve  bir tane String
        //  Return tipi int olmalı.
        //  ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.

        //  Örneğin;
        //  ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //  String Orange:
        //  Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = new ArrayList<>();
        arrayList.add("Orange");
        arrayList.add("Kiwi");
        arrayList.add("Peach");
        arrayList.add("Banana");
        arrayList.add("Orange");
        String aranan="Orange";
        int count=getCount(arrayList,aranan);
        System.out.println(count);
    }

    public static int getCount(ArrayList<String> arrayList, String aranan) {
        int count=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(aranan)) {
                count++;
            }
        }
        return count;
    }

}
