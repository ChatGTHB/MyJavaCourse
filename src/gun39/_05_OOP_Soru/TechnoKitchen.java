package gun39._05_OOP_Soru;

public class TechnoKitchen {
    public static void hazirla(IFood food) {
        if (food instanceof AdanaKebap) {
            System.out.println("Adana Kebap siparişi alındı.\n** HAZIRLANMAYA BAŞLANDI**");
            ((AdanaKebap) food).marinade();
            ((AdanaKebap) food).grill();
            System.out.println("Siparişiniz Hazır.");
            food.taste();
            System.out.println("=========================================================");
        } else if (food instanceof Lahmacun) {
            System.out.println("Lahmacun siparişi alındı.\n** HAZIRLANMAYA BAŞLANDI**");
            ((Lahmacun) food).bake();
            ((Lahmacun) food).addMeat();
            ((Lahmacun) food).dough();
            System.out.println("Siparişiniz Hazır.");
            food.taste();
            System.out.println("=========================================================");
        } else if (food instanceof Borsh) {
            System.out.println("Borsh siparişi alındı.\n** HAZIRLANMAYA BAŞLANDI**");
            ((Borsh) food).eatTomorrow();
            ((Borsh) food).boil();
            System.out.println("Siparişiniz Hazır.");
            food.taste();
            System.out.println("=========================================================");
        } else if (food instanceof Palov) {
            System.out.println("Palov siparişi alındı.\n** HAZIRLANMAYA BAŞLANDI**");
            ((Palov) food).fry();
            ((Palov) food).boil();
            System.out.println("Siparişiniz Hazır.");
            food.taste();
            System.out.println("=========================================================");
        }
    }
}
