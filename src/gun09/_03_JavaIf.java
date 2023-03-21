package gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //Girilen iki sayıdan büyük olanın değerini ekrana yazdırınız,
        //eşit ise eşit yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = input.nextInt();

        System.out.print("Enter another number : ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Big number = " + num1);
        } else if (num2 > num1) {
            System.out.println("Big number = " + num2);
        } else System.out.println("The numbers you entered are equal.");

    }
}
