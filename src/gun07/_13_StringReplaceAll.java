package gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll : Replace gibi çalışır. Farkı kriter (regex) verilebiliyor.
        //regex : regular expression/düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("text = " + text);
        System.out.println("abn -> _ = " + text.replaceAll("[abn]", "_"));
        // a, b veya n'ler _ yap -->Merh___ Dü_y_123

        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]", ""));
        //rakamları sil --> Merhaba Dünya

        System.out.println("0-9 dışındakiler -> \"\" = " + text.replaceAll("[^0-9]", ""));
        //rakamlar dışındakileri sil --> 123


    }
}
