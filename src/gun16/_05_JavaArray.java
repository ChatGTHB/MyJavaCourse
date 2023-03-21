package gun16;

import java.util.HashSet;

public class _05_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[] kanallar = {"A1", "B2", "C3", "D4", "E5"};
        int random = (int) (Math.random() * kanallar.length);
        System.out.println(kanallar[random]);



    }
}
