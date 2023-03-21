package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (10 dahil) olarak doldurduktan sonra;
        // kullanıcının  gireceği bir rakamı arattırınız.
        // Arattırılan rakam var ise indexini yazdırınız.

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Index is : " + i);
            }
        }


    }
}
