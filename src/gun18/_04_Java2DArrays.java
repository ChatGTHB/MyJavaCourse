package gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        Scanner input = new Scanner(System.in);

        int[][] array = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("Enter a number : ");
                array[row][column] = input.nextInt();
            }
        }
        int number = array[0][0];

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                if (array[row][column] > number) {
                    number = array[row][column];
                }
            }
        }

        System.out.println("The biggest number = " + number);
    }
}
