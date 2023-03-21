package gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_Soru_Cozum {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk = new TreeMap<>();

        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int secim = 0;

        do {
            System.out.print("\nMENÜ\n\n1- Ekleme\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\n\nSeçiminiz : ");
            secim = inputInt.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("\nKelime ekleme Seçildi.\nSözlüğe eklemek istediğiniz kelimeyi giriniz : ");
                    String kelime = inputStr.nextLine();
                    System.out.print("Girdiğiniz kelimenin manasını yazınız : ");
                    String manasi = inputStr.nextLine();
                    kelimeEkle(sozluk, kelime, manasi);
                    break;
                case 2:
                    System.out.print("\nDüzeltme seçildi.\nDüzeltmek istediğiniz kelimeyi giriniz : ");
                    kelime = inputStr.nextLine();
                    System.out.print("Düzeltmek istediğiniz kelimenin manasını yazınız : ");
                    manasi = inputStr.nextLine();
                    kelimeDuzelt(sozluk, kelime, manasi);
                    break;
                case 3:
                    System.out.println("\nListeleme seçildi.\n");
                    kelimeListele(sozluk);
                    break;
                case 4:
                    System.out.print("\nArama seçildi.\nAramak istediğiniz kelimeyi giriniz : ");
                    kelime = inputStr.nextLine();
                    kelimeAra(sozluk, kelime);
                    break;
                case 5:
                    System.out.println("\nSilme seçildi.\nSilmek istediğiniz kelimeyi giriniz : ");
                    kelime = inputStr.nextLine();
                    kelimeSil(sozluk, kelime);
                    System.out.print("İşleminiz gerçekleştirildi");
                    break;

                case 6:
                    sozluktenCik();
                    break;
                default:
                    hataliIslemBildir();

            }
        } while (secim != 6);


        // TODO : Geri kalan menu işlemleri yapılacak
        // TODO :  2.Aşama menulerde yapılacak işlemleri METHOD ile yapınız.

    }

    public static void hataliIslemBildir() {
        System.out.println("Hatalı seçim yaptınız. ");
    }

    public static void sozluktenCik() {
        System.out.println("Çıkış işleminiz gerçekleştirildi.");
    }

    public static Map kelimeSil(Map<String, String> sozluk, String kelime) {
        sozluk.remove(kelime);
        return sozluk;
    }

    public static void kelimeAra(Map<String, String> sozluk, String kelime) {
        for (Map.Entry<String, String> liste : sozluk.entrySet()) {
            if (liste.getKey().startsWith(kelime)) {
                System.out.println(liste.getKey());
            }
        }
    }

    public static void kelimeListele(Map<String, String> sozluk) {
        for (Map.Entry<String, String> liste : sozluk.entrySet()) {
            System.out.println(liste.getKey() + " : " + liste.getValue());
        }
    }

    public static Map kelimeDuzelt(Map<String, String> sozluk, String kelime, String manasi) {
        sozluk.put(kelime, manasi);
        return sozluk;
    }

    public static Map kelimeEkle(Map<String, String> sozluk, String kelime, String manasi) {
        sozluk.put(kelime, manasi);
        return sozluk;
    }
}
