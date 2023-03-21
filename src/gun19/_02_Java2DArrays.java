package gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] chart = {{4, 55}, {45, 6, 77}, {4, 2, 999, 45, 56, 66}, {42, 12, 9}, {4}};

        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                System.out.print(chart[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
