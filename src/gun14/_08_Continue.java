package gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String Expression : ");
        String expression = input.nextLine();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == ' ')
                continue;
            System.out.println(expression.charAt(i));
        }

    }
}
