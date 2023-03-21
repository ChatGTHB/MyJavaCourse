package gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        //toUpperCase : Stringi büyük harfe çevirir

        String text = "Merhaba Dünya";

        System.out.println("Orijinal hali text = " + text);// Merhaba Dünya
        System.out.println("text.toUpperCase() = " + text.toUpperCase());// MERHABA DÜNYA

        System.out.println("Text cümlesi me ile veya ME ile başlıyor mu = "
                + text.toUpperCase().startsWith("ME"));//true

        System.out.println("text = " + text);
    }
}
