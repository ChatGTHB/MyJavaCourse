package gun34._02_Ornek;
public class Ogrenci {
    private final int id;
    private String isim;
    private Tip tip;
    static int sayacID = 1;

    public Ogrenci(String isim, Tip tip) {
        this.id=sayacID++;
        setIsim(isim);
        setTip(tip);
    }
    public int getId() {
        return id;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public Tip getTip() {
        return tip;
    }
    public void setTip(Tip tip) {
        this.tip = tip;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tip=" + tip +
                '}';
    }
}
