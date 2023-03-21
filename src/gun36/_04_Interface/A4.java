package gun36._04_Interface;
// 1 class birden fazla Interface implent edebilir
public class A4 implements IGosterir,IYazdirir {
    // hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("Gösterdi.");
    }
    @Override
    public void yazdir() {
        System.out.println("Yazdirdi.");
    }
}
