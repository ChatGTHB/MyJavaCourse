package gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer ayırıyor, sadece tam sayı atılabiliyor.

        // tam sayılar
        byte byteDeger = 7;//-128  127
        short shortDeger = 1645;// -32000...32000 (yaklaşık değer)
        int intDeger = 250000;
        long longDeger = 2323232323232323L;

        // ondalıklı sayılar
        // ondalıklı sayılarda default DOUBLE'dır.
        double doubleDeger = 3.1445554544454;// noktadan sonra 16 hane duyarlıdır
        float floatDeger = 3.14F;// noktadan sonra 7 hane duyarlıdır

        //karakter ve karakterler
        char basHarf = 'A';// bir tane kararkter saklayabilir
        String isim = "Kerem";// kelime veya cümle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);
    }
}
