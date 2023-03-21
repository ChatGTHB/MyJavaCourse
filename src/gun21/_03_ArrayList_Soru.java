package gun21;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int toplam = 0;
        int gecen = 0;
        String secim;

        do {
            System.out.print("Enter a not : ");
            int not = input.nextInt();
            numberList.add(not);
            toplam += not;
            System.out.print("Devam etmek istiyor musunuz ? Seçiminizi yapınız. E/H : ");
            secim = inputString.next();
        }
        while (secim.equalsIgnoreCase("E"));

        int ortalama = toplam / numberList.size();
        System.out.println("Ortalama = " + ortalama);

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > ortalama) {
                gecen++;
            }
        }
        System.out.println("Geçen öğrenci sayısı= " + gecen);
    }
}