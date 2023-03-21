package gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecek() {
        System.out.println("Eti çok severler.");

    }
    @Override
    void yemekMiktari() {
        System.out.println("Yemek miktarı, kartaldan kartala değişir.");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günlük uyku süresi, kartaldan kartala değişir.");

    }

    @Override
    void sesi() {
        System.out.println("Fiyuuuu");
    }
}
