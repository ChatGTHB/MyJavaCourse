package gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println("Total (num1+num2) = " + (num1 + num2));
    }
}
