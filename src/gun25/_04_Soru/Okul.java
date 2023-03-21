package gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Ogrenci ogr=new Ogrenci();

            System.out.print("Okul No=");
            ogr.okulNo=okuInt.nextInt();
            System.out.print("Tam Adı=");
            ogr.tamAdi=okuStr.nextLine();
            System.out.print("Notu   =");
            ogr.notu=okuInt.nextInt();

            snf.add(ogr);
            System.out.println();
        }

        bilgileriYazdir(snf);
        ortalamaYaz(snf);
    }

    public static void  bilgileriYazdir(ArrayList<Ogrenci> snf){
        for(Ogrenci ogr : snf){
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
            System.out.println();
        }
    }

    public static void  ortalamaYaz(ArrayList<Ogrenci> snf){

        double toplam=0;
        for(Ogrenci ogr : snf){
            toplam=toplam+ogr.notu;
        }
        System.out.println("Öğrenci sayısı = " + snf.size());
        System.out.println("Ortalama = " + (toplam/snf.size()) );
    }
}
