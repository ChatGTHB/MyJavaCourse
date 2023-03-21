package gun10;

import java.util.Scanner;

public class _06_IfElse_incele {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password = input.nextLine();

        if (password.length() >= 8 && password.length() <=12 && !password.toLowerCase().contains("pass"))
            System.out.println("Valid password");
        else System.out.println("Invalid password");

        /*
public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre=");
        String sifre=oku.nextLine();

        int uzunluk=sifre.length();
        boolean varMi=sifre.toLowerCase().contains("pass");

        if (uzunluk >= 8 && uzunluk <=12 && varMi==false)  // !varMi
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");


        // 2.Yöntem
        if (sifre.length() >= 8 && sifre.length() <=12 && sifre.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");


        // 3. Yöntem
        if (sifre.length() >= 8 && sifre.length() <=12 && !sifre.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");*/



    }
    }

