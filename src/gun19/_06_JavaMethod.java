package gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        merhabaYazIsme("Kerem");
        cokMerhabaYaz(5);
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String isim) {
        System.out.println(isim + " Merhaba");

    }

    private static void cokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");

        }

    }



}
