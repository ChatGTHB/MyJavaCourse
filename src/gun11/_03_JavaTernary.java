package gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }

        String result=(number%2!=0)?"Odd Number":"Even Number";
        System.out.println("result = " + result);

        System.out.println((number%2!=0)?"Odd Number":"Even Number");
    }
}
