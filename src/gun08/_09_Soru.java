package gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        //Girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence=input.nextLine();

        int space= sentence.indexOf(" ");

        String firstWord=sentence.substring(0,space);

        System.out.println("firstWord = " + firstWord);


    }
}
