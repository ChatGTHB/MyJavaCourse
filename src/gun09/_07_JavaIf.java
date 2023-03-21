package gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //Girilen bir cümlede küçük veya büyük a harfinin geçip geçmediğini yazdırınız.
        // VAR ve YOK şeklinde

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine().toLowerCase();

        if (sentence.contains("a"))
            System.out.println("VAR");
        if (!sentence.contains("a"))
            System.out.println("YOK");
    }
}
