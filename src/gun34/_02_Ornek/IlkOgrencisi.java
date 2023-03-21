package gun34._02_Ornek;
public class IlkOgrencisi extends Ogrenci{
    private String kulüp;
    public IlkOgrencisi(String isim, Tip tip, String kulüp) {
        super(isim, tip);
        setKulüp(kulüp);
    }
    public String getKulüp() {
        return kulüp;
    }
    public void setKulüp(String kulüp) {
        this.kulüp = kulüp;
    }
    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "id=" + getId() +
                ", isim='" + getIsim() + '\'' +
                ", tip=" + getTip() +
                ", kulüp='" + getKulüp() + '\'' +
                "} ";
    }
}
