package gun38._03_Abstract;

public class SezarSalad extends Salad{

    public SezarSalad(String name) {
        super(name);
    }

    @Override
    String madeIn() {
        return "Italy";
    }

    @Override
    public String toString() {
        return "{" +
                "name ='" + getName() + '\'' +
                ", taste ='" + taste() + '\'' +
                ", madeIn ='" + madeIn() + '\'' +
                '}';
    }
}
