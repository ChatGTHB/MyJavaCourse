package gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: Bir Stringi parçalara ayırmak demek.
        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Cümle : ");
        String cumle = input.nextLine();

        String[] kelimeler = cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println((i + 1) + ". kelime = " + kelimeler[i]);
        }
    }
}
