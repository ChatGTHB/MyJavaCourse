package gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.println("Your number = "+number);
        int numeral = number % 10;

        switch (numeral) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

        }


    }
}
