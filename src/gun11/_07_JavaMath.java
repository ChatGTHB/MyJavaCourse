package gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //Math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();

        System.out.print("Enter third number : ");
        int number3 = input.nextInt();

        System.out.println("First Method : ");

        int abc = Math.max(number1, number2);
        abc = Math.max(abc, number3);

        System.out.println("The Biggest Number = " + abc);

        System.out.println("----------------------------------------------");

        System.out.println("Second Method : ");

        int abc2 = Math.max(number1, Math.max(number2, number3));

        System.out.println("The Biggest Number = " + abc2);


    }
}
