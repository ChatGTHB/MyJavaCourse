package gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int number= input.nextInt();

        System.out.println("First method : ");
        int result=(number>50)?1:0;
        System.out.println("result = " + result);

        System.out.println("Second Method : ");
        System.out.println((number>50)?1:0);


    }
}
