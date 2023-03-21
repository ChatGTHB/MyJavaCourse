package gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunuzu 100'lük sisteme göre giriniz (0-100) : ");
        double vize = input.nextDouble();

        System.out.print("Final notunuzu 100'lük sisteme göre giriniz (0-100) : ");
        double finall = input.nextDouble();

        double total = ((0.5 * vize) + (0.5 * finall));

        if (total <= 100 && total >= 60) {
            System.out.println("Notunuz : " + total + " \nTebrikler. Geçtiniz.");
        } else if (total < 60 && total >= 0) {
            System.out.println("Notunuz : " + total + " \nBütünlemeye kaldınız.");
        } else {
            System.out.println("Notunuz : " + total + " \nHatalı sonuç. " +
                    "\nVize ve final sınav sonuçlarınızı 100'lük sisteme göre giriniz. (0-100)");
        }
    }
}
