package gun33._02_Ornek;

public class Kedi extends  Hayvan{
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("Miyavladı.");
    }
}
