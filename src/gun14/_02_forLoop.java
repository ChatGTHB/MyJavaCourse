package gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        /*1- Başı belli, sonu belli, yani kaç adım döneceği belli ve artış miktarı
        belli ise bu FOR döngüsüdür.

        2- Kaç kere döneceği belli değil ise(kullanıcı 0 değeri girene kadar) WHILE döngüsüdür.

        3-While döngüsünde döngü kontrolü işlemden sonra ise DO-WHILE dongusudur.*/

        // 1'den 5'e kadar olan sayıları ekrana yazdırınız.
        //Döngünün kaç defa döneceği belli olmayan durumlarrda While:

        int i = 1;
        while (i <= 5) {
            System.out.print(" w_i = " + i);
            i++;
        }
        System.out.println();

        //for döngüsü; başı belli, sonu belli, artışı belli ise

        for (i = 1; i <= 5; i++) {
            System.out.print(" f_i = " + i);
        }

    }
}
