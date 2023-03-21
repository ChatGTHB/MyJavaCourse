package gun07;

public class _08_StringEndWith {
    public static void main(String[] args) {
        //EndsWith : verilen karakter(ler) ile bitiyor mu
        //sonuç true veya false yani boolean olarak döner

        String text="Merhaba Dünya";

        System.out.println("text.endsWith(ya) = " + text.endsWith("ya"));//true
        System.out.println("text.endsWith(n) = " + text.endsWith("n"));//false
        System.out.println("text.endsWith(A) = " + text.endsWith("A"));//false
        System.out.println("text.endsWith(Dünya) = " + text.endsWith("Dünya"));//true
    }
}
