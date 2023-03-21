package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number : ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        theSmallestNumber(array);
        theLargestNumber(array);
        averageOfNumbers(array);
    }
    private static void averageOfNumbers(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        int average = total / array.length;
        System.out.println("Average = " + average);
    }
    private static void theLargestNumber(int[] array) {
        Arrays.sort(array);
        System.out.println("The Largest Number = "+array[array.length - 1]);
    }
    private static void theSmallestNumber(int[] array) {
        Arrays.sort(array);
        System.out.println("The Smallest Number = "+array[0]);
    }
}
