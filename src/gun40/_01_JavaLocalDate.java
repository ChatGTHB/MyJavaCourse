package gun40;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gün ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n******************");
        // Localde aldığım tarihi istediği ülkenin formatına göre, diline göre nasıl gösteririm.
        // Örneğin localdeki saati Almanya'ya göre nasıl gösteririz.

        System.out.println("FULL Almanya Gösterimi = "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // lokalizasyon tanımlaması
        // en-US : birincisi dili, ikincisi ülkeyi temsil ediyor. Amerikan İngilizcesi
        // en-UK : UK İngilizcesi
        // fr-CA : Kanada Fransızcası

        Locale [] kullanilabilirLokaller=Locale.getAvailableLocales();
        
        for(Locale lokal:kullanilabilirLokaller){
            if(lokal.getDisplayCountry().toLowerCase().contains("chi")){
                System.out.println("Dil = " + lokal.getDisplayLanguage());
                System.out.println(", Ülke = " + lokal.getDisplayCountry());
                System.out.println(", " + lokal.getLanguage());
                System.out.println(", " + lokal.getCountry());
            }
        }

        Locale lokalcince=new Locale("zh","CN");

        System.out.println("FULL Çince Gösterimi = "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalcince)));


        System.out.println("\n************************İstediğim Formatta Gösterim*************************");
        // İstediğim Formatta Gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = "+ tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy= "+ tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy= "+ tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy= "+ tarih.format(ozelFormat4));

        System.out.println("ozel format ve loc EEEE dd.MM.yyyy = " + tarih.format(ozelFormat3.withLocale(Locale.UK)));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy= "+ tarih.format(ozelFormat5));

        System.out.println("\n************************");
        // Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5;

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));

    }
}
