package gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir tam sayının pozitif, negatif veya sıfır durumunu yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number= input.nextInt();

        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");

        }
    }
}
