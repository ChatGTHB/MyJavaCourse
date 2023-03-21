package gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print((i+1)+".Öğrenci Adı=");  ogr.adi = okuStr.nextLine();
            System.out.print((i+1)+".Öğrenci Soyadı=");  ogr.soyadi = okuStr.nextLine();
            System.out.print((i+1)+".Öğrenci Sinifi=");  ogr.sinifi = okuInt.nextInt();
            System.out.print((i+1)+".Öğrenci Adresi=");  ogr.adres = okuStr.nextLine();
            snf.add(ogr);
            System.out.println();
        }

        int sayac=0;
        for(Ogrenci i : snf)
        {
            System.out.println((sayac+1)+".ogr.adi = " + i.adi);
            System.out.println((sayac+1)+".ogr.soyadi = " + i.soyadi);
            System.out.println((sayac+1)+".ogr.sinifi = " + i.sinifi);
            System.out.println((sayac+1)+".ogr.adres = " + i.adres);
            sayac++;
            System.out.println();
        }
    }
}

class Ogrenci{
    // properties, field, özellik
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
