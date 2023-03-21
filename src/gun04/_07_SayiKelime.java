package gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //yazıların rakamlara, rakamların yazıya çevrilmesi.

        String ad="Kerem";
        String kelimeSayi="65"; // string halde, toplama gibi bir işleme giremez.

        int sayiDeger=Integer.parseInt(kelimeSayi);// sayiya döünüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        String strToplam=Integer.toString(toplam);
        System.out.println("strToplam = " + strToplam);
    }
}
