package gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (musteriNo(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşterinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.


        Musteri musteri1 = new Musteri();
        musteri1.musteriNo=1;
        musteri1.ad = "Hakan";
        musteri1.soyad = "Kuş";

        musteri1.musteriHesap.paraYatir(100);
        musteri1.musteriHesap.paraYatir(200);
        musteri1.musteriHesap.paraCek(50);

        System.out.println(musteri1.musteriHesap);

    }


}
