package gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan calisan1 = new Calisan();
        calisan1.id = 1;
        calisan1.name = "Kerem";
        calisan1.name = "Yiğit";
        // calisan1.password="1234";
        // artı private kendi paketinden bile çağrılamaz

        calisan1.sifreAta("1234");
        calisan1.sifreAta("K789.MlD23");
        calisan1.sifreGoster();

    }
}
