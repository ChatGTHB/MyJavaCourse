package gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5
        // For döngüsü ile yapalım.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine().trim();
        int space = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                space++;
            }
        }
        int  numberOfSpace= space + 1;

        System.out.println("Word Count = " + numberOfSpace);


    }
}
