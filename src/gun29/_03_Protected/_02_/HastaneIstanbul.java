package gun29._03_Protected._02_;
import gun29._03_Protected._01_.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doktor doktor1=new Doktor("Said");
        doktor1.hastaneAd="İstanbul Hastanesi";

        //Doktor doktor2=new Doktor();
        //default; sadece kendi paketi ulaşır

    }
}
