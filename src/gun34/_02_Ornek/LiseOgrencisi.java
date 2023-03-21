package gun34._02_Ornek;
public class LiseOgrencisi extends Ogrenci{
    private  String brans;
    public LiseOgrencisi(String isim, Tip tip,String brans) {
        super(isim, tip);
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
