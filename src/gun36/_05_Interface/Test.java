package gun36._05_Interface;
public class Test implements IYazdirir,IGosterir {
    @Override
    public void goster() {
        System.out.println("Gosterdi.");

    }
    @Override
    public void yaz(String msg) {
        System.out.println(msg);

    }
    @Override
    public void yaz() {
        System.out.println("Yazdırdı.");

    }
}
