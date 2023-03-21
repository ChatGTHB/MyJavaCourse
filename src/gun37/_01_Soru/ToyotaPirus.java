package gun37._01_Soru;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }
    @Override
    public String changeBattery() {
        return "Ömür boyu kullan.";
    }
    @Override
    public String changeOil() {
        return "15000 km yağ değişimi.";
    }
    @Override
    public String drive() {
        return "Auto Pilot özelliği mevcut değil.";
    }
}
