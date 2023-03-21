package gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println("You entered an odd number.");
        } else {
            System.out.println("You entered an even number. ");
        }


    }
}
