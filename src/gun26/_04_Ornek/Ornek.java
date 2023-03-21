package gun26._04_Ornek;

public class Ornek {
    public static void main(String[] args) {
        /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

        Musteri musteri1 = new Musteri();
        musteri1.name = "Fethi Gündüzalp";
        musteri1.elektrikHesabi = new ElektrikHesabi();

        musteri1.elektrikHesabi.tuketimEkle(50);
        musteri1.elektrikHesabi.tuketimEkle(71);
        musteri1.elektrikHesabi.tuketimEkle(43);
        musteri1.elektrikHesabi.toplamTuketimYaz();

        musteri1.elektrikHesabi.faturaYaz(musteri1.name);


    }

}
