package gun30._01_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int kimlikNo;// değiştirilemez
    // yani sadece bir kez veri atama şansı var

    static int kimlikNoSayac = 1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.kimlikNo = kimlikNoSayac++;
        // final değişkenlerine sadece bir kez veri atanabilir
        // o da ya tanımlarken, ya da Constructor'da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", kimlikNo=" + kimlikNo +
                '}';
    }
}
