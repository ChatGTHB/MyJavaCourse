package gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi= (int) oran;//(int)sayi=(double)oran
        System.out.println("sayi = " + sayi);
        /**************************************************************************** */

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre= (byte) (kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        System.out.println("cevre = " + cevre);

        int cevre2=(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        System.out.println("cevre2 = " + cevre2);
    }
}
