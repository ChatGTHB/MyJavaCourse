package gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //Girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num= input.nextInt();

        System.out.println("Is it odd ? :" +(num%2 !=0));


    }
}
