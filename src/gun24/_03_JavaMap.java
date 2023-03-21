package gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {

        // 2 kişi için kartvizit uygulaması yapınız

        HashMap<String, String> uKartvizit = new HashMap<>();

        uKartvizit.put("isim", "Ugur Yalçın");
        uKartvizit.put("email", "ugur@tmail.com");
        uKartvizit.put("adres", "Çekmeköy/İstanbul");
        uKartvizit.put("telefon", "01234567899");

        System.out.println("uKartvizit.get(\"isim\") = " + uKartvizit.get("isim"));
        System.out.println("uKartvizit.get(\"telefon\") = " + uKartvizit.get("telefon"));

        HashMap<String, String> aKartvizit = new HashMap<>();

        aKartvizit.put("isim", "Ayşe Bayrak");
        aKartvizit.put("email", "ayse@tmail.com");
        aKartvizit.put("adres", "Şişli/İstanbul");
        aKartvizit.put("telefon", "99876543210");

        HashMap<String, HashMap<String, String>> kartvizitler = new HashMap<>();

        kartvizitler.put("ugur", uKartvizit);
        kartvizitler.put("ayse", aKartvizit);

        System.out.println("Uğur'un kartviziti = " + kartvizitler.get("ugur"));
        System.out.println("Ayşe'nin Kartviziti = " + kartvizitler.get("ayse"));

         // Ayşe'nin adresi
        System.out.println("Ayşenin adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece emailler
        for (Map.Entry<String, HashMap<String, String>> kv : kartvizitler.entrySet()){
            System.out.println("emailler = " + kv.getValue().get("email"));
        }


    }
}
