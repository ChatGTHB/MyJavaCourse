package gun28._03_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Kitap kitap1=new Kitap();

        kitap1.name="Kitap1";
        kitap1.publishyear=2001;
        kitap1.author="Kitabim1";

        Kitap kitap2=new Kitap("Kitap2",2002,"Kitabim2");

        Kitap kitap3=new Kitap("Kitap3",2003);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);


    }
}

