package gun31._04_EnumSoru;

public enum PizzaSize {
    SMALL(10),
    MEDIUM(15),
    LARGE(20);

    final int fiyat;

    PizzaSize(int fiyat) {
        this.fiyat=fiyat;
    }
}
