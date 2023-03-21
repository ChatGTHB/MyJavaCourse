package gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava baklava=new Baklava("Baklava");
        CheeseCake cheeseCake=new CheeseCake("Cheese_Cake");
        SezarSalad sezarSalad=new SezarSalad("Sezar_Salad");
        GreekSalad greekSalad=new GreekSalad("Greek_Salad");

        System.out.println("Greek_Salad = " + greekSalad);
        System.out.println("Sezar_Salad = " + sezarSalad);
        System.out.println("Cheese_Cake = " + cheeseCake);
        System.out.println("Baklava = " + baklava);

    }
}
