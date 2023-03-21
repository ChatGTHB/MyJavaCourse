package gun33._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {

        Calisan calisan = new Calisan("Hakan", 10000, 1.2);
        System.out.println("calisan = " + calisan);

        GenelMudur genelMudur = new GenelMudur("Nihat", 12000, 1.8, 1000);
        System.out.println("genelMudur = " + genelMudur);

    }
}
