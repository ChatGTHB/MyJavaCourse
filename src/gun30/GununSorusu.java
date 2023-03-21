package gun30;

public class GununSorusu {

    public static void main(String[] args) {
        GununSorusu gs1 =new GununSorusu();
        gs1.a=5;

        GununSorusu gs2 =new GununSorusu();
        gs2.a=7;


        // a'nın değeri kaç oldu şu anda :: Burada verilecek cevap hangi a'yı soruyorsunuz olmalı.
        // Burada her nesnenin a'sı var ve gs1'in 5, gs2'nin ise 7 değeri var.

        System.out.println(gs1.a);
        System.out.println(gs2.a);

        // Soru b'nin değeri kaçtır : tek bir değeri vardır; en son değer
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.arttir(); // gs1.a --> 6, b --> 1
        gs2.arttir();// gs2.a --> 8, b --> 2
        // Soru a'nın ve b'nin en son değerleri kaçtır?
        System.out.println("s1.a = " + gs1.a); // s1.a = 6
        System.out.println("s2.a = " + gs2.a); // s2.a = 8
        System.out.println("Soru.b = " + GununSorusu.b); // Soru.b = 2


    }

    int a;
    static int b=0;

    void arttir() {
        a++;
        b++;
    }

}
