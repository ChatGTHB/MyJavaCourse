package gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }
    @Override
    public String changeBattery() {
        return "Batarya ömrü 9 yıl.";
    }
    @Override
    public String drive() {
        return "Auto Pilot özelliği mevcut.";
    }
}
