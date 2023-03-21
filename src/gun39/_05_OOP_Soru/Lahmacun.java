package gun39._05_OOP_Soru;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("Enfes Lahmacun. Afiyet olsun..");
    }

    @Override
    public double ucret() {
        return 33;
    }

    void dough() {
        System.out.println("Pişirildi...");
    }

    void addMeat() {
        System.out.println("Et eklendi...");
    }

    void bake() {
        System.out.println("Hamur açıldı...");
    }
}
