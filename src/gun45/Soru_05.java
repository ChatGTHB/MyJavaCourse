package gun45;

public class Soru_05 {
    public static void main(String[] args) {
        int numbers[];

        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4]; // burada dizi tamamen sıfırlanıyor
        numbers[2] = 30;
        numbers[3] = 40;

        for (int x :
                numbers) {
            System.out.print(" " + x); // 0 0 30 40
        }
    }
}
