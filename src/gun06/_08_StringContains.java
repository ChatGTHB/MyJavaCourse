package gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        /* contains : bir stringin içerisinde karakter (lerin) var olup
        olmadığını boolean cinsinden söyle true veya false */

        String cumle="Merhaba Dünya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //direkt de yapabilirsiniz
        System.out.println("varMi = "+cumle.contains("a"));

        System.out.println("cumle.contains(ya) = " +cumle.contains("ya"));
        System.out.println("cumle.contains(k) = " +cumle.contains("k"));
    }
}
