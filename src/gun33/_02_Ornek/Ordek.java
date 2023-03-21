package gun33._02_Ornek;

public class Ordek extends Hayvan{
    private double kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi,double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
       // super.konustu();
        System.out.println("Vakvakladı.");
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
