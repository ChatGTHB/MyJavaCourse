package gun37._02_Soru;

public class Duck extends Animal implements ISailing,IFlying{
    @Override
    public String food() {
        return "Yeşilliklere ayrı bir düşkünlükleri vardır.";
    }
}
