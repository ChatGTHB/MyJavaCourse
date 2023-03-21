package gun07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        //indexOf gibi çalışır fakat lastIndexOf aramaya sondan başlar

        //0123456
        String s1 = "Merhaba";

        System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));//4
        System.out.println("s1.lastIndexOf(a) = " + s1.lastIndexOf("a"));//6
        // İndex her zaman tekdir. Sadece arama yönü değişir.
    }
}
