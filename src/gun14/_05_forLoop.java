package gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2.bölüm : Çarpımın değeri 100'ü geçtiğinde işlem sonlansın.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int total = 1;

        for (int i = 1; i <= number; i++) {
            total *= i;
            if (total >= 10000) {
                System.out.println("Break çalıştı.");
                break;
            }
        }
        System.out.println("Total = " + total);
    }
}
