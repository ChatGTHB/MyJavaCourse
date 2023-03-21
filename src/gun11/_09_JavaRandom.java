package gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number from 0 to 4 (including 4): ");
        int number= input.nextInt();
        System.out.println("number = " + number);

        int randomNumber= (int) (Math.random()*5);
        System.out.println("randomNumber = " + randomNumber);

        System.out.println(randomNumber==number?"Congratulations you knew":"You didn't know");

    }
}
