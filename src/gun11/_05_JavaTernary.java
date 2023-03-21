package gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen bir sayının sıfır mı, negatif mi, pozitif mi olduğunu yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int number= input.nextInt();

        System.out.println("First method : ");
        String result=(number==0)?"Zero":(number>0?"Pozitif":"Negatif");
        System.out.println("result = " + result);

        System.out.println("Second Method : ");
        System.out.println((number==0)?"Zero":(number>0?"Pozitif":"Negatif"));


    }
}
