package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;

public class Array_ArrayList_Odev_7 {
    public static void main(String[] args) {
        // 7-  getLength() isminde bir method oluşturun.
        //   Parametre olarak String ArrayList
        //   Return tipi Integer ArrayList
        //   ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //   Tüm elementlerin uzunluğunu döndürün
        //   Örneğin;
        //   ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //   Tüm Stringlerin uzunluklarını yazdırın;
        //   cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("New jersey");
        sehirler.add("New york");
        sehirler.add("Ohio");
        sehirler.add("Florida");
        sehirler.add("Boston");

        System.out.println(getLength(sehirler));
    }

    public static ArrayList<Integer> getLength(ArrayList<String>arrayList) {
        ArrayList<Integer>arrayListUzunluk = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayListUzunluk.add(arrayList.get(i).length())  ;
        }
        return arrayListUzunluk;
    }
}
