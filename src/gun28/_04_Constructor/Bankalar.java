package gun28._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Banka bankA=new Banka("bankA",5,1937);
        Banka bankB=new Banka("bankB",51);
        Banka bankC=new Banka("bankC");

        System.out.println("bankA = " + bankA);
        System.out.println("bankB = " + bankB);
        System.out.println("bankC = " + bankC);
    }
}

class Banka{
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public Banka(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}