package gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //Kullanıcı 0 değeri girinceye kadar girdiği sayıların toplamını bulunuz.

        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.println("Enter a number : ");
        number = input.nextInt();
        total += number;

        while(number!=0){
            System.out.println("Enter a number : ");
            number= input.nextInt();
            total+=number;
        }
        System.out.println("Total = " + total);

    }
}
