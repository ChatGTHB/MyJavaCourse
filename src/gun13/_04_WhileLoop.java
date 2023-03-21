package gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayıdan sadece pozitif olanların toplamını bulunuz.

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int total = 0;

        while (counter <= 20) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            System.out.println(number);
            counter++;
            if (number > 0) {
                total += number;
            }
            System.out.println("Subtotal = " + total);
        }
        System.out.println("Total = " + total);


    }
}
