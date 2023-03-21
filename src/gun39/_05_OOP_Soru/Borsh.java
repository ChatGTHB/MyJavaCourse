package gun39._05_OOP_Soru;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Enfes Borsh. Afiyet olsun...");
    }

    @Override
    public double ucret() {
        return 33;
    }

    void boil() {
        System.out.println("Kaynatıldı...");
    }

    void eatTomorrow() {
        System.out.println("Etler sebzeler eklendi...");
    }
}
