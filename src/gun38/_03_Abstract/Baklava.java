package gun38._03_Abstract;

public class Baklava extends Sweet {

    public Baklava(String name) {
        super(name);
    }

    @Override
    String madeIn() {
        return "Türkiye";
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
