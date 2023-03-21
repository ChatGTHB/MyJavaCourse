package gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        //Tek seferde girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name and surname : ");
        String nameSurname = input.nextLine();

        int boslukIndex = nameSurname.indexOf(" ");

        String name = nameSurname.substring(0, boslukIndex);
        String surname = nameSurname.substring(boslukIndex + 1);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("Name Surname : " + name + " " + surname);


    }
}
