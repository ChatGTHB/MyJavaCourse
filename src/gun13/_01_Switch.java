package gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 12 : ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("January = 31 Days");
                break;
            case 2:
                System.out.println("February = 28 Days ");
                break;
            case 3:
                System.out.println("March = 31 Days");
                break;
            case 4:
                System.out.println("April = 30 Days");
                break;
            case 5:
                System.out.println("May = 31 Days");
                break;
            case 6:
                System.out.println("June = 30 Days");
                break;
            case 7:
                System.out.println("July = 31 Days");
                break;
            case 8:
                System.out.println("August = 31 Days");
                break;
            case 9:
                System.out.println("September = 30 Days");
                break;
            case 10:
                System.out.println("October = 31 Days");
                break;
            case 11:
                System.out.println("November = 30 Days");
                break;
            case 12:
                System.out.println("December = 31 Days");
                break;
            default:
                System.out.println("You entered incorrectly. Enter a number from 1 to 12.");

        }

        System.out.println("--------------------------------");

        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            default:
                System.out.println("You entered incorrectly. Enter a number from 1 to 12.");

        }


    }
}
