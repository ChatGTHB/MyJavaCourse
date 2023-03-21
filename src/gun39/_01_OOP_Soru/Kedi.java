package gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecek() {
        System.out.println("Eti çok severler.");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Yemek miktarı, kediden kediye değişir.");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günlük uyku süresi, kediden kediye değişir.");

    }
    @Override
    void sesi() {
        System.out.println("Miyav.");
    }
}
