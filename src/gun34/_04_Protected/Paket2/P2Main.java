package gun34._04_Protected.Paket2;

import gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p2h=new P1Hayvan();
        p2h.ad="kopek"; // public erişildi
        // p2h.yas default diğer paketten erişilemez
        // p2h.cinsi protected diğer paketten erişilemez
        // p2h.renk private, sadece kendi classından

    }
}
