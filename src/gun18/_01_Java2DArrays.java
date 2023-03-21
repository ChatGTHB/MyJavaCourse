package gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int number = 0;
        int[] array = new int[100];

        int[] lecture1Notes = new int[50];//
        int[] lecture2Notes = new int[50];
        int[] lecture3Notes = new int[50];


        int[][] allLectureNotes = new int[3][50];

        lecture1Notes[0] = 80;
        allLectureNotes[0][0] = 80;

        System.out.println(allLectureNotes[0][0]);

        Scanner input = new Scanner(System.in);
        allLectureNotes[0][0] = input.nextInt();

    }
}
