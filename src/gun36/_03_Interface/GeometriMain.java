package gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember cember=new Cember();
        cember.ciz(); // Çember çizildi.

        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.ciz(); // Dikdörtgen çizildi.


        //interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir cember2=new Cember();
        cember2.ciz(); // Çember çizildi.
        // direkt olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişebilirsin

        cizdirme(cember2);    // Çember çizildi.
        cizdirme(dikdortgen); // Dikdörtgen çizildi.

    }

    private static void cizdirme(ICizdirir iciz) {
        iciz.ciz();
    }


}
