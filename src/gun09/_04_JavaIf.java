package gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println("You entered a single number.");
        } else {
            System.out.println("You entered an even number. ");
        }
    }
}
