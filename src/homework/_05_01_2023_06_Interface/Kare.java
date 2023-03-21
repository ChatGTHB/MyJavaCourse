package homework._05_01_2023_06_Interface;

public class Kare implements IAlanveCevreHesaplar {


    @Override
    public double alanHesapla(double... kenarlar) {
        return kenarlar[0]*kenarlar[0];
    }

    @Override
    public double cevreHesapla(double... kenarlar) {
        return kenarlar[0]*4;
    }
}

