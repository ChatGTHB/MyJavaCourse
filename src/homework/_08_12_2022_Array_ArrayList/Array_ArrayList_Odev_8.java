package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;

public class Array_ArrayList_Odev_8 {
    public static void main(String[] args) {


//   8)- İsmi changelnArraylist() olan bir method oluşturun.
//       Parametre olarak String ArrayList, String s1, String s2
//       Arraylist'te s1'i s2 olarak değiştirin
//       Return String arrayList
//       Örneğin;
//       Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//       s1 = blue
//       s2 = yellow
//       Tüm blue 'ları yellow'a dönüştürün.
//       cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("yellow");
        renkler.add("red");
        renkler.add("blue");
        renkler.add("red");
        renkler.add("blue");
        String mavi = "blue";
        String sari = "yellow";
        System.out.println(changelnArraylist(renkler, mavi, sari));
    }

    public static ArrayList<String> changelnArraylist(ArrayList<String> kelimeler, String s1, String s2) {
        ArrayList<String> yeniKelimeler = new ArrayList<>();
        for (int i = 0; i < kelimeler.size(); i++) {
            if (kelimeler.get(i).equals(s1)) {
                yeniKelimeler.add(s2);
            } else {
                yeniKelimeler.add(kelimeler.get(i));
            }
        }
        return yeniKelimeler;
    }
}
