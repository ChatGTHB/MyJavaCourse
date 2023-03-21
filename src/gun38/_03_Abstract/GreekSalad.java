package gun38._03_Abstract;

public class GreekSalad extends Salad{

    public GreekSalad(String name) {
        super(name);
    }
    @Override
    String madeIn() {
        return "Greece";
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
