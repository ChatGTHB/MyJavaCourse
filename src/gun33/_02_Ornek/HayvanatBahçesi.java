package gun33._02_Ornek;

public class HayvanatBahçesi {
    public static void main(String[] args) {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

        Kopek kopek=new Kopek("beyaz",50,"kangal");
        kopek.konustu();

        Kedi kedi=new Kedi("siyah",3,"tekir");
        kedi.konustu();

        Ordek ordek=new Ordek("siyah",3,"gövel",90);
        ordek.konustu();

        Yilan yilan=new Yilan("boz",4,"anakonda",123);
        yilan.konustu();

    }
}
