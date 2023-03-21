package gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı.");

        try {                   // dene, hatanın başladığı yerin üstüne konur.
            LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);
        }                       // hata olduğu zaman programı kırma
        catch (Exception ex) {  // ex isimli değişkende oluşan hataların bilgisi atanıyor
                                // hata olduğunda yapılması istenenler buraya yazılıyor.
            System.out.println("Hata oluştu. Lütfen tekrar deneyiniz.");
            System.out.println("Tüm hata mesajı = "+ex);
            System.out.println("Hatanın açıklaması = "+ex.getMessage());
            // hata mesajını kendine mail atabilirsin
            // log tutma : program nasıl çalışıyor, hata loglarını harddiske yazabilirsin.
        }
        System.out.println("Program bitti.");

        try {
            // Java ve Toolları çalışmaya devam et.
            // Konuları öğrenmeye ve çalışmaya devam.
        }   // Anlamadığın yer mi oldu? Kırılmadan devam et.
        catch (Exception ex) {
            // Hatanın sebebini anla;
            // Derse daha fazla odaklan;
            // Gereken videoları izle;
            // Grup çalışması yap;
            // Öğren ve kırılmadan devam et;
            // Unutma! Sen bir söz verdin, DEVAM...
        }
            // Sonunda seni güzel bir meslek bekliyor.
    }
}
