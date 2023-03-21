package gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktörİyel)
        // bir fonksiyonda buldurup, bunun sonucunu main'de tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println(factorial(number));

        System.out.println(factorial(number) % 2 != 0 ? "Tek" : "Çift");

    }
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}