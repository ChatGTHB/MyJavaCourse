package gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        // equals ile aynı çalışır sadece büyük küçük harf fark etmez

        String s1 = "Merhaba";
        String s2 = "MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));//false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));//true
    }
}
