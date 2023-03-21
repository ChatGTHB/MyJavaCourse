package gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        //Ekrana 5 kez merhaba yazdırınız.

        int sayac = 0;

        while (sayac < 5) {
            System.out.println(sayac + ".Merhaba");

            sayac++;
        }
        System.out.println("Program bitti.");
    }
}
