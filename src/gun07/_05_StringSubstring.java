package gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        //Stringin belli bir bölümünü alma işlemini yapar

        String s1 = "Merhaba Arkadaşlar";

        String parca1 = s1.substring(3, 9);// 3 nolu indexten 9 nolu indexe kadar,9 dahil değil
        System.out.println("parca1 = " + parca1);

        String parca2 = s1.substring(8, 15);
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8);//verilenden başlayıp sona kadar yazdırır, 8 dahil
        System.out.println("parca3 = " + parca3);
    }
}
