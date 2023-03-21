package gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO : Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        ArrayList<Pizza> siparisler = new ArrayList<>();

        int secim = 0;
        int toplamUcret = 0;

        do {
            menu();
            secim = oku.nextInt();
            // secilen pizza ArrayListe ekleyelim

            if (secim == 1) {
                Pizza pizza1 = new Pizza(PizzaSize.SMALL);
                siparisler.add(pizza1);
                toplamUcret+=pizza1.size.fiyat;
            } else if (secim == 2) {
                Pizza pizza1 = new Pizza(PizzaSize.MEDIUM);
                siparisler.add(pizza1);
                toplamUcret+=pizza1.size.fiyat;
            } else if (secim == 3) {
                Pizza pizza1 = new Pizza(PizzaSize.LARGE);
                siparisler.add(pizza1);
                toplamUcret+=pizza1.size.fiyat;
            } else if (secim == 4) {
                siparisleriGoster(siparisler);
            }
            // eğer 4 ü seçerse arraylist i bir metoda gönder
            // orada hangi pizzadan kaç sipariş verdiğini göster
        } while (secim <= 4 && secim >= 0);

        System.out.println("toplamUcret = " + toplamUcret);
    }

    public static void siparisleriGoster(ArrayList<Pizza> siparisler) {
        for (Pizza pizza : siparisler) {
            System.out.println(pizza.size);
        }
    }

    public static void menu() {
        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Sipariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");
    }

}
