package gun39._05_OOP_Soru;

public class AdanaKebap implements IFood {

    @Override
    public void taste() {
        System.out.println("Enfes Adana. Afiyet olsun...");
    }

    @Override
    public double ucret() {
        return 55;
    }

    void marinade() {
        System.out.println("Marine edildi...");
    }

    void grill() {
        System.out.println("Izgarada pişirildi...");
    }
}
