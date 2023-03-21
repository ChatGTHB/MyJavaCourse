package gun34._03_Ornek;

public class LiseOgrencisi extends Ogrenci {
    private  String brans;
    private static int liseIdSayac=1;
    public LiseOgrencisi(String isim, Tip tip, String brans) {
        super(isim, tip,liseIdSayac++);
        setBrans(brans);
    }
    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        this.brans = brans;
    }
    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "id=" + getId() +
                ", isim='" + getIsim() + '\'' +
                ", tip=" + getTip() +
                ", brans='" + getBrans() + '\'' +
                "} ";
    }
}
