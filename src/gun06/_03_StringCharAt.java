package gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // İstenilen noktadaki karakteri verir.
        // karakterlerin sırası 0'dan başlar ve buna index denir.

        //             0123456789 10 11 12
        String cumle= "Merhaba Dünya"; // length 13 ama karakterlerin odası 0-12 dahil

        char ilkHarf=cumle.charAt(0); // 0 index deki kararkteri ver (ilk karakter)
        System.out.println("ilkHarf = " + ilkHarf);


    }
}
