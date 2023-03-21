package gun13;

import java.util.Scanner;

public class _24_11_2022_Homework {
    public static void main(String[] args) {

        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz.

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int total = 0;

        while (counter <= 20) {
            System.out.print("Enter " + counter + ". number : ");
            int number = input.nextInt();
            counter++;
            if (number % 2 != 0) {
                total += number;
            }
        }
        System.out.println("Total = " + total);


        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz.

        Scanner input2 = new Scanner(System.in);

        int counter2 = 1;
        int oddCounter = 0;

        while (counter2 <= 20) {
            System.out.print("Enter " + counter2 + ". number : ");
            int number2 = input2.nextInt();
            counter2++;
            if (number2 % 2 != 0) {
                oddCounter++;
            }
        }
        System.out.println("Number Of Odd Numbers = " + oddCounter);


        //3- Kullanıcının gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int number3 = input3.nextInt();
        int total3 = 0;
        int counter3 = 0;

        do {
            counter3++;
            total3 += counter3;
        } while (counter3 < number3);
        System.out.println("Total = " + total3);


        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner input4 = new Scanner(System.in);

        int counter4 = 1;
        int total4 = 0;

        while (counter4 <= 5) {
            System.out.print("Enter " + counter4 + ". number : ");
            int number4 = input4.nextInt();
            counter4++;
            if (number4 >= 10 && number4 <= 30) {
                total4 += number4;
            }
        }
        System.out.println("Total of numbers between 10 and 30 = " + total4);


        //5- 100'e kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int counter5 = 1;
        int fiveCounter = 0;

        while (counter5 <= 100) {
            counter5++;
            if (counter5 % 10 == 5) {
                fiveCounter++;
            }
        }
        System.out.println("Number of numbers with a ones digit of 5 = " + fiveCounter);


        //6- Bir sayı bulmaca oyunu yapılmak isteniyor

        //bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,

        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,

        //bilemediniz yazıp tutulan sayıyı bildirsin.

        //Eğer bilirse tebrikler yazsın.


        //-------Question6 --> The First Solution---> With Do While Loop----------\\

        Scanner input6 = new Scanner(System.in);

        int randomNumber = (int) ((Math.random() * 10) + 10);
        int counter6 = 0;
        int number6;

        do {
            System.out.print("Enter a number from 10 to 20 : ");
            number6 = input6.nextInt();
            counter6++;
        } while (counter6 < 3 && number6 != randomNumber);

        if (number6 == randomNumber) {
            System.out.println("Congrulations.");
        } else {
            System.out.println("You didn't know. The number the computer holds =" + randomNumber);
        }

        //-------Question6 --> The Second Solution --> With While Loop----------\\

        int randomNumber6_1 = (int) ((Math.random() * 10) + 10);

        Scanner input6_1 = new Scanner(System.in);
        System.out.print("Enter a number from 10 to 20 : ");

        int number6_1 = input6_1.nextInt();
        int counter6_1 = 0;

        while (counter6_1 < 3 && number6_1 != randomNumber6_1) {
            System.out.print("Enter a number from 10 to 20 : ");
            number6_1 = input6_1.nextInt();
            counter6_1++;
        }
        if (number6_1 == randomNumber6_1) {
            System.out.println("Congrulations.");
        } else {
            System.out.println("You didn't know. The number the computer holds =" + randomNumber6_1);
        }


        //Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için

        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner input7 = new Scanner(System.in);

        System.out.print("Enter a three-digit number : ");
        int number7 = input7.nextInt();

        if (number7 >= 100 && number7 <= 999) {

            int onesDigit = number7 % 10;
            int tensDigit = number7 / 10 % 10;
            int hundredsDigit = number7 / 100 % 10;

            System.out.println("The Number Entered = " + number7 + "\n" + "Ones digit = " + onesDigit + "\n" +
                    "Tens digit = " + tensDigit + "\n" + "Hundreds digit = " + hundredsDigit);
        } else {
            System.out.println("You entered incorrectly. Enter a three-digit number. ");
        }


        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        //-------Question8 --> The First Solution --> With While Loop----------\\

        Scanner input8 = new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        int number8 = input8.nextInt();

        System.out.println("Your number is = " + number8);

        int counter8 = 0;
        if (number8 >= 0) {
            while (number8 > 0) {
                number8 /= 10;
                counter8++;
            }
            System.out.println("Your number is " + counter8 + " digits.");
        } else System.out.println("You entered incorrectly. Enter a positive number.");

        //-------Question8 --> The Second Solution --> With String----------\\

        Scanner input8_2 = new Scanner(System.in);

        System.out.print("Enter a number : ");
        String strNumber = input8_2.nextLine();

        System.out.println("Your number is :" + strNumber);

        String newStrNumber = strNumber.replaceAll("\\D", "");

        int number8_2 = newStrNumber.length();

        System.out.println("The number you entered " + newStrNumber + " is " + number8_2 + " digits.");


        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner input9 = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number9 = input9.nextInt();
        System.out.println("Your number is = " + number9);

        System.out.print("The reverse of the number you entered = ");
        while (number9 > 0) {
            System.out.print(number9 % 10);
            number9 = number9 / 10;
        }

        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

        Scanner input10 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number10 = input10.nextInt();
        int tempNumber10 = number10;
        System.out.println("Your number is = " + number10);
        int reverse10 = 0;
        while (number10 != 0) {
            reverse10 = reverse10 * 10;
            reverse10 = reverse10 + number10 % 10;
            number10 /= 10;
        }
        System.out.println("The reverse of the number you entered = " + reverse10);

        if (reverse10 == tempNumber10) {
            System.out.println("The number you entered is symmetrical");
        } else {
            System.out.println("The number you entered is not symmetrical");
        }


    }
}
