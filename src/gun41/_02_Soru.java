package gun41;

import utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {

         DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");

        while(true) {
             LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.bekle(1);
        }

    }
}
