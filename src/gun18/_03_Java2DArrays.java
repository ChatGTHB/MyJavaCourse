package gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz.
        System.out.println("The First Solution : ");
        int[][] array = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        int counter = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] % 2 != 0) {
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println("Number of odd numbers = " + counter);

        System.out.println("\nThe Second Solution : ");

         int[][] array2 = new int[2][3];
         int counter2 = 0;

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                array2[row][column] = (int) (Math.random() * 100);
                System.out.print(array2[row][column] + " ");
                if (array2[row][column] % 2 != 0) {
                    counter2++;
                }
            }
            System.out.println();
        }

        System.out.println("Number of odd numbers = " + counter2);

    }
}
