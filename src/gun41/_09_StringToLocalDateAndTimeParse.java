package gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse{
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve String durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesi

        long startTime=System.currentTimeMillis();// kodun performansı

        Scanner input=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023) = ");
        String strTarih= input.nextLine();

        // Kullanıcının gireceği formata göre faormat oluşturmak
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı. parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strTarih,dtf);
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(dtf) = " + tarih.format(dtf));

        long finishTime=System.currentTimeMillis();
        System.out.println("Geçen süre = "+(finishTime - startTime)+"ms");
    }
}
