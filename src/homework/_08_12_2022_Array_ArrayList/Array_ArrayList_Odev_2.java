package homework._08_12_2022_Array_ArrayList;

public class Array_ArrayList_Odev_2 {
    public static void main(String[] args) {

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
    }
}
