package gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Bir öğrencinin girilen notuna göre (50 den büyük-eşit ise geçtiniz, küçük ise kaldınız) sonuç yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam result : ");
        int examResult = input.nextInt();

        if (examResult >= 50)
            System.out.println("You passed the exam.");
        if (examResult < 50)
            System.out.println("You failed the exam.");
    }
}
