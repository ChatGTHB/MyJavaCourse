package gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifreniz : ");
        String newPassword = input.nextLine();

        try {
            if (newPassword.length() < 8) { // bu mesaj ile hata oluştur
                throw new Exception("Şifre en az 8 karakterden oluşmalı.");
            }
            if (newPassword.length() > 15) { // bu mesaj ile hata oluştur
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı.");
            }
        }catch(Exception ex){
            // Hatalar bir yere toplanıp, hepsi için yapılması gereken işlemler
            // burada birarada yapılabilir. Log tutma gibi.
            System.out.println("Lütfen Dikkat !");
            System.out.println(ex.getMessage());
            // log tutma
        }
    }
}
