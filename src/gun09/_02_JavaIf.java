package gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (number > 0)
            System.out.println("The number you entered is positive.");
        else if (number < 0)
            System.out.println("The number you entered is negative.");
        else
            System.out.println("You entered the number of zeros.");

    }
}
