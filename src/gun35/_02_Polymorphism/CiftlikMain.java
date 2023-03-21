package gun35._02_Polymorphism;
public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("Karabaş");
        kopek1.ses(); // havladı
        kopek1.kokladi(); // kokladı

        Kedi kedi1=new Kedi("Köpük");
        kedi1.ses(); // miyavladı
        kedi1.tirmaladi(); // tırmaladı

        kopekSesi(kopek1); // havladı
        kediSesi(kedi1); // miyavladı

        hayvanSesi(kopek1); // havladı-kokladı
        hayvanSesi(kedi1); //  miyavladı-tırmaladı

        /*********************************/
        // Referans tipi   // nesne tipi
        Hayvan hayvan1=new Hayvan("ördek");// hayvanlardan bir hayvan
        Hayvan hayvan2=new Kopek("kangal");// hayvanlardan bir köpek
        Hayvan hayvan3=new Kedi("boncuk");// hayvanlardan bir kedi

        System.out.println("-------------------------");
        hayvan1.ses(); // genel hayvan "ses çıkardı"
        hayvan2.ses(); // köpek hayvan "havladı"
        hayvan3.ses(); // kedi hayvan "miyavladı"
        System.out.println("-------------------------");

        //  aşağıda Hayvan classından türettiğimiz-extend yaptığımız için
        //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
        //  köpek ve kedi için classlarında Override yaparak yazdığımız
        //  özellikleri alarak yazdı.
        //  Ama tırmaladı, kokladı gibi kedi, köpek classına özel olarak
        //  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
        //  Fakat aşağıdaki gibi bir nevi tip dönüşümü yapılabilir.
        // ((Kopek)hayvan2).kokladi(); //tip dönüşümü yaptık ve artık kokladı çıktı.
        // ((int)Math.random()) casting burdaki gibi tip dönüşümü

        hayvan2.ses(); // köpek de olsa hayvan referansı sebebiyle
                      // metotlar kısıtlı

        ((Kopek) hayvan2).kokladi(); // artık diğer metotları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

        // Polymorphism -
        // Çok formluluk  - Çok çeşitlilik
        // Şizofren bir konu
        //
        // Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        // ve bu şekilde kullanılabilmesine Polymorphism denir.

        // Öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.
    }

    private static void hayvanSesi(Hayvan hayvan) {
        // buraya hem kedi hem köpek geliyor.
        hayvan.ses();

        if(hayvan instanceof Kopek){ // hayvan aslında köpek mi
            ((Kopek) hayvan).kokladi();
        }
        if(hayvan instanceof Kedi){ // hayvan aslında kedi mi
            ((Kedi) hayvan).tirmaladi();
        }
    }
    private static void kediSesi(Kedi kedi1) {
        kedi1.ses();
    }
    private static void kopekSesi(Kopek kopek1) {
        kopek1.ses();
    }
}








