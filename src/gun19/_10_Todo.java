package gun19;

public class _10_Todo {
    public static void main(String[] args) {
        // TODO:
        // Bizim 3 tane saatimiz vardır.
        // Bir tanesi saatte 20 dk geri kalıyor.
        // Bir tanesi saatte 15 dakika ileri gidiyor
        // Saatlerin 3'ü de saat 16:00'da çalışmaya başlıyor.

        // Bu saatler kaç saat ve dakika sonra tekrar aynı saati gösterirler.

        int saat1 = 0;
        int saat2 = 0;
        int saat3 = 0;

        do {
            saat1 += 40;
            saat2 += 60;
            saat3 += 75;
        }
        while ((saat1 + saat2 + saat3) % 48 != 0);
        System.out.println(saat1);//00.00-0800-0800
        System.out.println(saat2);//16.00-1600-0400
        System.out.println(saat3);//07.00-2000-0000

    }
}
