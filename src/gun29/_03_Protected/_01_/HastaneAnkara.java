package gun29._03_Protected._01_;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doktor doktor1=new Doktor();
        doktor1.adi="Kerem";
        doktor1.bolumu="Dahiliye";
        doktor1.hastaneAd="Ankara Hastanesi";
        //doktor1.sicilNo private

        Doktor doktor2=new Doktor("Said");

    }
}
