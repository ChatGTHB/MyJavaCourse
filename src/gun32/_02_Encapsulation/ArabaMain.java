package gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

        Araba araba = new Araba("Mavi", 1985, 2000, 5);

        System.out.println("araba = " + araba);




        Araba araba2 = new Araba();

        araba2.setRenk("Kırmızı");
        araba2.setModel(2010);
        araba2.setMotorHacmi(3000);
        araba2.setKapiSayisi(3);

        System.out.println("araba2 = " + araba2);

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

    }
}
