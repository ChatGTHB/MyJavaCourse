package gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Daire daire=new Daire(4);
        daire.setName("Yeni Daire");
        daire.ciz();
        System.out.println("Daire = " + daire);


        Dikdortgen dikdortgen=new Dikdortgen(4,5);
        dikdortgen.setName("Yeni dikdörtgen");
        dikdortgen.ciz();
        System.out.println("Dikdörtgen = " + dikdortgen);

    }
}
