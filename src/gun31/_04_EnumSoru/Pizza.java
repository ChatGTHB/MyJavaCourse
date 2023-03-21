package gun31._04_EnumSoru;

public class Pizza {
    PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                '}';
    }
}
