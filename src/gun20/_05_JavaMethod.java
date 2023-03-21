package gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {

        int s1=4;
        int s2=12;
        int s3=34;
        int s4=45;

        int sonuc1=toplamBul(s1,s2);
        System.out.println("toplamBul(s1,s2) = " + toplamBul(s1, s2));

        int sonuc2=toplamBul(s1,s2,s3);
        System.out.println("toplamBul(s1,s2,s3) = " + toplamBul(s1, s2, s3));

        String ad="Kerem Said";
        String soyad="Köse";
        String sonuc3=toplamBul(ad,soyad);
        System.out.println("toplamBul(ad,soyad) = " + toplamBul(ad, soyad));
    }

    private static String toplamBul(String ad, String soyad) {
        return (ad+" "+soyad);
    }

    private static int toplamBul(int s1, int s2) {
        return s1+s2;
    }

    public static int toplamBul(int s1, int s2, int s3) {
        return s1+s2+s3;
    }
}
