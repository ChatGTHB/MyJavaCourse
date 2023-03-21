package homework;

import java.util.Scanner;

public class _11_11_2022_Homework {
    public static void main(String[] args) {

        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("name = " + name);
        System.out.println();

        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input1.nextInt();
        System.out.println("number = " + number);
        System.out.println();

        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your favourite fruit : ");
        String fruit = input2.nextLine();
        System.out.println("fruit = " + fruit);
        System.out.println();

        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the number of doors in your car : ");
        int door = input3.nextInt();
        System.out.println("door = " + door);
        System.out.println();

        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the city you lived in 10 years ago : ");
        String city = input4.nextLine();
        System.out.println("city = " + city);
        System.out.println();

        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.

        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter your birthday : ");
        String birthday = input5.nextLine();
        System.out.println("birthday = " + birthday);
        System.out.println();

        /*7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
             Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız. */

        Scanner input6 = new Scanner(System.in);
        System.out.print("Bir banka hesabınız var mı? Hesabınız varsa True yoksa False yazınız : ");
        boolean bankAccount = input6.nextBoolean();
        System.out.println("bankAccount = " + bankAccount);
        System.out.println();

        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        Scanner input7 = new Scanner(System.in);
        System.out.print("Enter a value in kilograms : ");
        byte kilogram = input7.nextByte();
        System.out.println("kilogram = " + kilogram);
        System.out.println();

        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        Scanner input8 = new Scanner(System.in);
        System.out.print("Enter your height in meters : ");
        float height = input8.nextFloat();
        System.out.println("height = " + height);


    }
}
