package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner input = new Scanner(System.in);

        int[][] chart = new int[3][2];
        int counter = 0;

        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                System.out.print("Enter a number : ");
                chart[i][j] = input.nextInt();
                if (chart[i][j] % 2 != 0) {
                    counter++;
                }
            }
        }
        int[] array = new int[counter];
        counter = 0;
        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                if (chart[i][j] % 2 != 0) {
                    array[counter] = chart[i][j];
                    counter++;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
