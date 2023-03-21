package homework._08_12_2022_Array_ArrayList;

import java.util.ArrayList;
public class Array_ArrayList_Odev_6 {
    public static void main(String[] args) {

    // 6- getSum() isminde bir method oluşturun.
    //    Parametresi ArrayList olmalı
    //    Return tipi int olmalı.
    //    ArrayList teki tüm sayıları birbiri ile toplayın.
    //    return olarak toplam sonucu döndürün.
    //    Örneğin;
    //    Arraylist = 1,2,3,4,5
    //    return 15 olmalı

        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(getSum(sayilar));

    }

    public static int getSum(ArrayList<Integer> sayiList) {
        int toplam=0;
        for (int i = 0; i < sayiList.size(); i++) {
            toplam+=sayiList.get(i);
        }
        return toplam;
    }
}
