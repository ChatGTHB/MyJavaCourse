package gun38._03_Abstract;

public abstract class Sweet extends Food {
    public Sweet(String name) {
        super(name);
    }
    @Override
    String taste() {
        return "Sweet";
    }
}
