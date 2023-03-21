package gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lesson and exam score (Ex = Math : 100) :");
        String grade = input.nextLine();
        String examScore = grade.replaceAll("\\D", "");
        int examScoree = Integer.parseInt(examScore);
        System.out.println("examScoree = " + examScoree);

        if (examScoree >= 90) {
            System.out.println("A");
        } else if (examScoree >= 80) {
            System.out.println("B");
        } else if (examScoree >= 70) {
            System.out.println("C");
        } else if (examScoree >= 60) {
            System.out.println("D");
        } else if (examScoree >= 40) {
            System.out.println("E");
        } else System.out.println("F");
    }
}
