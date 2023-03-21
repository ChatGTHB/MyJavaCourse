package gun36._06_Interface;
public class Dikdortgen implements IAlanveCevreHesaplar {

    @Override
    public double alanHesapla(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }
    @Override
    public double cevreHesapla(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }
}
