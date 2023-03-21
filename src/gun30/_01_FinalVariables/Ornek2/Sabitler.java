package gun30._01_FinalVariables.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi = 24;
    final static int birSaattekiDakikaSayisi = 60;
    final static int birDakikakiSaniyeSayisi = 60;


    public static int saniyeHesapla(int gun, int saat, int dakika, int saniye) {
        return (gun * birGundekiSaatSayisi * birSaattekiDakikaSayisi * birDakikakiSaniyeSayisi)
                + (saat * birSaattekiDakikaSayisi * birDakikakiSaniyeSayisi)
                + (dakika * birDakikakiSaniyeSayisi)
                + saniye;
    }

}
