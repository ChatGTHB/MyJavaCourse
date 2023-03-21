package gun29._03_Protected._01_;

public class Doktor {
    protected  String adi;// default ile aynı
    String bolumu;// default
    private String sicilNo;// private
    public String hastaneAd;// public

    public Doktor() {// default constructor
    }

    public Doktor(String adi) {
        this.adi = adi;
    }
}
