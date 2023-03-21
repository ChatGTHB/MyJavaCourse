package gun34._03_Ornek;

public class Ogrenci {
    private final int id;
    private String isim;
    private Tip tip;

    public Ogrenci(String isim, Tip tip,int id) {
        setIsim(isim);
        setTip(tip);
        this.id=id;
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
