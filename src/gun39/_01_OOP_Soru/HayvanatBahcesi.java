package gun39._01_OOP_Soru;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kartal kartal=new Kartal("Kara Kartal",true,"01/01/2020");
        Kedi kedi=new Kedi("Mavi Rus Kedisi",false,"01/01/2022");

        System.out.println("Kartal = " + kartal);
        System.out.println("Kedi = " + kedi);

    }
}
