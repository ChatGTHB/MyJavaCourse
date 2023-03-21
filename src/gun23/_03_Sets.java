package gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        // Ekrana tek tek nasıl yazdırırım
        for (String eleman : renkler) {// sıra garanti değil
            System.out.println("eleman = " + eleman);
        }
        // foreach örneği
        //int[]dizi={34,5,6,7,8,89,899,77};
        //for(int sayi:dizi){
        //    System.out.println("sayi = " + sayi);
        //}

        // setin kendi sırası nasıl ise onun aynısını verir
        Iterator<String> gosterge = renkler.iterator();
        while (gosterge.hasNext()) {
            System.out.println("Gösterdiği Eleman = " + gosterge.next());
            // .Next göstergesinin gösterdiği elemanı temsil eder.
        }
    }
}
