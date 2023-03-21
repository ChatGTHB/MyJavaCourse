package gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] sayilar = new int[50];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 != 0) {
                sayilar[i] = 1;
            } else {
                sayilar[i] = 0;
            }
            System.out.println(sayilar[i]);

        }
    }
}
