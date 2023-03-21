package gun38._03_Abstract;

public abstract class Food {
    private String name;

    public Food(String name) {
        setName(name);
    }

    abstract String madeIn();

    abstract String taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
