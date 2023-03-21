package gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {
    private String kulüp;
    private static int ilkIdSyac=1;
    public IlkOgrencisi(String isim, Tip tip, String kulüp) {
        super(isim, tip,ilkIdSyac++);
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
