package gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner input = new Scanner(System.in);
        String character;

        do {
            System.out.print("Enter a character : ");
            character = input.next();
            if (!character.equalsIgnoreCase("x"))
                System.out.println("The program is running.");
        }
        while (!character.equalsIgnoreCase("x"));
        System.out.println("Program done.");
    }
}
