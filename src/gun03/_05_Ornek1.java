package gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        /*
        İki kenarı tanımlı olarak verilen bir dikdörtgenin çevresini ve alanını bulunuz.
         */

        int kisaKenar = 4;
        int uzunKenar = 8;
        int cevre = 2 * (kisaKenar + uzunKenar);
        int alan = kisaKenar * uzunKenar;
        System.out.println("kisaKenar = " + kisaKenar);
        System.out.println("uzunKenar = " + uzunKenar);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
