package gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();
        toplamYaz(4, 5); // 9

        enbYaz(4, 5); // 5

        int enb = enbBul(4, 5);
        System.out.println("enbBul(4,5) = " + enbBul(4, 5)); // 5
    }

    public static int enbBul(int a, int b) {
        int donecek = 0;
        if (a > b) {
            donecek = a;
        } else {
            donecek = b;
        }
        return donecek;
    }

    public static void enbYaz(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void toplamYaz(int a, int b) {
        System.out.println(a + b);
    }

    public static void merhabaYaz() {
    }
}
