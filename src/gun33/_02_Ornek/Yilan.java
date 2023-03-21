package gun33._02_Ornek;

public class Yilan extends Hayvan{
    private double uzunluk;
    public Yilan(String renk, int kilo, String cinsi,double uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    @Override
    public void konustu() {
        // super.konustu();
        System.out.println("Tısladı.");
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }
}
