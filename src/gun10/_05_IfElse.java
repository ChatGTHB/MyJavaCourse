package gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet değilse hayır yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine().toLowerCase();

        if (sentence.contains("study") && sentence.length() > 10)
            System.out.println("Evet");
        else
            System.out.println("Hayır");
    }
}
