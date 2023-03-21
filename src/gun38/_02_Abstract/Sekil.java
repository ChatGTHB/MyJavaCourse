package gun38._02_Abstract;

public abstract class Sekil {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    abstract double alan();
    abstract double cevre();

    void ciz() {
        System.out.println(name+" isimli şekil çizildi.");
    }

    @Override
    public String toString() {
        return "\nName = " + name +
                ", \nAlan =" + alan() +
                ", \nÇevre =" + cevre() +"\n";
    }
}
