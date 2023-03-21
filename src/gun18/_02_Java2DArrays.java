package gun18;

import java.util.Arrays;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = {2, 3, 4, 5, 6, 7, 56, 67, 77};

        int[][] chart = new int[2][3];
        int[][] chart2 = {
                {2, 3, 4},  // 0. satır
                {34, 45, 5} // 1. satır
        };

        for (int row = 0; row < chart2.length; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(chart2[row][column] + " ");
            }
            System.out.println();
        }

    }
}
