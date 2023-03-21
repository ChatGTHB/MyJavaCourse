package gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] chart = {{3, 4, 55}, {234, 22, 33}};

        System.out.println(chart.length);
        System.out.println(chart[0].length);
        System.out.println(chart[1].length);

        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                System.out.print(chart[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
