package gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {

        String text="Merhaba Dünya";

        System.out.println("Orijinal hali text = " + text);// Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase());// merhaba dünya

        System.out.println("Text cümlesi me ile veya ME ile başlıyor mu = "
        +text.toLowerCase().startsWith("me"));

        System.out.println("text = " + text);
    }
}
