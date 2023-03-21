package gun21;

import java.util.ArrayList;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Kerem");
        isimler.add("Said");
        isimler.add("Hilal");
        isimler.add("Cihat");

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(2, "Köse");
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.set(2, "Akın");
        System.out.println("isimler = " + isimler);

        boolean isThere = isimler.contains("Kerem");
        System.out.println("isThere = " + isThere);

        isimler.remove("Akın");
        System.out.println("isimler = " + isimler);

        isimler.remove(1);// 1. indexi siler
        System.out.println("isimler = " + isimler);

        int indexOfKerem = isimler.indexOf("Kerem");
        System.out.println("indexOfKerem = " + indexOfKerem);

        String ilkEleman = isimler.get(0);
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);




    }
}
