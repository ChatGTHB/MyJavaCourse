package gun37._02_Soru;

public class Cat extends Animal implements IAnimal{
    @Override
    public String food() {
        return "Hem etle hem otla beslenirler.";
    }
}
