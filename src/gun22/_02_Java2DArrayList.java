package gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi = 5;
        int[] dizi = new int[20];
        int tablo[][] = new int[20][2];//20x2'lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste = new ArrayList<>();//istenildiği kadar sayı eklenebilen,uzunluğu değişken

        // Bir sınıf, bu sınıfta 20 kişi var ve bunların 3 dersi olsun.
        // Öğrencilerin bu 3 derse ait notlarını nasıl bir değişkende saklayabilirim?

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayList'in ArrayList'ini nasıl yaparım?

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();//Listlerin Listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(kimNotlari);
        notlarListesi.add(fizNotlari);

        notlarListesi.get(0);//->matNotlari
        int matbirNot = notlarListesi.get(0).get(0);// mat notlarının ilkini aldım

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0));// mat notları
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1));// fiz notları
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2));// kim notları

        //yukarıdakinin yerine bir for döngüsünü nasıl kullanırız?
        for (int i = 0; i < notlarListesi.size(); i++) {// 0,1,2
            System.out.println("notlarListesi.get(" + i + ") = " + notlarListesi.get(i));
        }

        //satır sütun yazdırma
        for (int i = 0; i < notlarListesi.size(); i++) {// i=satırlar, j=sütunlar
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //notlar[i].lehgth
                System.out.print(notlarListesi.get(i).get(j) + "\t");//notlar[i][j]
            }
            System.out.println();
        }
    }
}
