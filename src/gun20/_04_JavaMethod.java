package gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();

        System.out.println("Toplam = "+collectNumbers(number1, number2));

    }

    public static int collectNumbers(int num1, int num2) {
        return (num1 + num2);
    }
}
