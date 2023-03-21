package gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        //Kullanıcının girdiği gün numarasına karşılık gelen günün adını yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Day number = ");
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Incorrect Entry");

        }
    }
}
