package gun30._01_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas vatandas1=new Vatandas("Kerem");
        Vatandas vatandas2=new Vatandas("Said");
        Vatandas vatandas3=new Vatandas("Hilal");

        System.out.println("vatandas3 = " + vatandas3);
        System.out.println("vatandas2 = " + vatandas2);
        System.out.println("vatandas1 = " + vatandas1);


        //vatandas1.kimlikNo=12345;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlarken, ya da Constructor'da
        final double pi=3.14;// tanımlarken
        // pi=5; // sonradan değiştirilemez.
        // Math.PI; javanın nasıl yaptığına baktık,
        // o da bizim gibi yapmış
    }
}
// final :  değer atandıktan sonra değiştirilmeyi engelliyor
//          bu sebeple, hem sabit değerler için, hem de sonradan
//          değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
                     // yeni artan değer almasını sağlıyor
