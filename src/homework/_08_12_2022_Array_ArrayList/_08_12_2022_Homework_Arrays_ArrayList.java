package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;

public class _08_12_2022_Homework_Arrays_ArrayList {
    public static void main(String[] args) {

//   1- Şu şekilde olan bir 2D int Array'î oluşturunuz.
//    [{2,3,2} , {4,1,5} , {7,2,5}]
//    Bütün 2'leri 6'yla değiştirin. Array'i yazdırınız.

        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


//  2- Şu şekilde olan bir 2D int Array'i oluşturunuz.
//     [{5,2,1} , {10,2,3,6} , {1,2}]
//     2D array'de olan elemanları toplayınız.
//     Toplamı yazdırınız. Sonuç 32 olmalıdır.

        int[][] array2 = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int total = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                total += array2[i][j];
            }
        }
        System.out.println("Total = " + total);


//  3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
//     [{"new jersey","atlanta","ohio"} ,
//     {"Pittsburgh" ,"ohio","new york","ohio"} ,
//     {"ohio","new york"}]
//     Bütün ohio'ları Florida'yla değiştiriniz.
//     Array'i yazdırınız.

        String[][] array3 = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j].equals("ohio")) {
                    array3[i][j] = "Florida";
                }
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }



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

//  5-  ismi getCount() olan bir method oluşturun.
//      Parametre olarak bir String ArayList  ve  bir tane String
//      Return tipi int olmalı.
//      ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//      Örneğin;
//      ArrayList = Orange , Kiwi , Peach , Banana , Orange
//      String Orange:
//      Count = 2 olmalı. (Orange 2 kez yazılmış)



//  6-  getSum() isminde bir method oluşturun.
//      Parametresi ArrayList olmalı
//      Return tipi int olmalı.
//      ArrayList teki tüm sayıları birbiri ile toplayın.
//      return olarak toplam sonucu döndürün.
//      Örneğin;
//      Arraylist = 1,2,3,4,5
//      return 15 olmalı

//  7-  getLength() isminde bir method oluşturun.
//      Parametre olarak String ArrayList
//      Return tipi Integer ArrayList
//      ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//      Tüm elementlerin uzunluğunu döndürün
//      Örneğin;
//      ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//      Tüm Stringlerin uzunluklarını yazdırın;
//      cevap: 10 ,  8 , 4 , 7 , 6 olmalı



//  8-  İsmi changelnArraylist() olan bir method oluşturun.
//      Parametre olarak String ArrayList, String s1, String s2
//      Arraylist'te s1'i s2 olarak değiştirin
//      Return String arrayList
//      Örneğin;
//      Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//      s1 = blue
//      s2 = yellow
//      Tüm blue 'ları yellow'a dönüştürün.
//      cevap: "yellow" , "red" , "yellow" , "red" , "yellow"



    }

}