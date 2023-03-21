package gun38._03_Abstract;

public abstract class Salad extends Food {
    public Salad(String name) {
        super(name);
    }
    @Override
    String taste() {
        return "Sour";
    }
}
