package gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayının, 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = input.nextInt();
        boolean isSquare=false;
        int counter = 0;

        while (counter < number) {

            if (counter*counter == number) {
                System.out.println("Tam karedir. ");
                isSquare=true;
                break;
            }
            counter++;
        }

        if (isSquare==false) {
            System.out.println("Tam kare değildir.");
        }


    }
}
