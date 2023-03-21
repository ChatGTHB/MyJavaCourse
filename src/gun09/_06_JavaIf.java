package gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //Girilen bir cümlede a harfinin geçip geçmediğini bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        if (sentence.contains("a"))
            System.out.println("EVET");
        if (!sentence.contains("a"))
            System.out.println("HAYIR");
    }
}
