package gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your length of stay in the parking: ");
        int time = input.nextInt();

        if (time <= 3) {
            System.out.println("Your parking fee = 10 ₺");
        } else if (time > 5) {
            System.out.println("Your parking fee = 20 ₺");
        } else {
            System.out.println("Your parking fee = 15 ₺");
        }
    }
}
