package gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya (dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int total = 0;

        for(int i=1;i<number;i++){
            total+=i;
        }
        System.out.println("Total = " + total);
    }
}
