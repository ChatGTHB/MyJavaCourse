package homework._05_01_2023_06_Interface;

public class Dikdortgen implements IAlanveCevreHesaplar {

    @Override
    public double alanHesapla(double... kenarlar) {
        return kenarlar[0]*kenarlar[1];
    }

    @Override
    public double cevreHesapla(double... kenarlar) {
        return (kenarlar[0]+kenarlar[1])*2;
    }
}
