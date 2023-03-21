package gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1 = input.nextInt();
        System.out.print("Enter another number : ");
        int number2 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Select the mathematical operation you want to do :\n" +
                "Addition-> T\n" + "Remove->   Ç\n" + "Divide->   B\n" + "Multiply-> P");
        String operation = input2.next().toUpperCase();
        System.out.println("Your choice : "+operation);
        if (operation.equals("T")) {
            System.out.println("Result = " + number1 + number2);
        } else if (operation.equals("Ç")) {
            System.out.println("Result = " + (number1 - number2));
        } else if (operation.equals("B")) {
            System.out.println("Result = " + number1 / number2);
        } else if (operation.equals("P")) {
            System.out.println("Result = " + number1 * number2);
        } else System.out.println("You entered wrong.");


    }
}
