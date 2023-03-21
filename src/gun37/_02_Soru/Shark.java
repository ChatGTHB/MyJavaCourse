package gun37._02_Soru;

public class Shark extends Animal implements ISailing{
    @Override
    public String food() {
        return "Çoğunlukla diğer balıklar ve deniz canlıları ile beslenirler.";
    }
}
