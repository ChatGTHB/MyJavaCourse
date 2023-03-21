package gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle=cumle+"Bugün"; // + işareti Stringlerde birleştirme yapar
        cumle=cumle+" hava"; // atama ister
        cumle=cumle+" cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dün sıcaktı."));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat(" fakat dün sıcaktı."); // concat da birleştirir fakat atama ister.
        System.out.println("cumle = " + cumle);

        /****************StringBuilder*****************/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün "); // append: ekler, atama gerektirmez.
        cumle2.append("hava ");
        cumle2.append("soğuk.");

        System.out.println("cumle2 = " + cumle2);

        /********  +, concat, Stri,ngBuilder 3 modelin hızı test edilecek. **********/

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1=test1+" merhaba";
        }
        System.out.println("+ için süre "+ (System.currentTimeMillis()-startTime)+" ms");


        startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2=test2.concat(" merhaba");
        }
        System.out.println("concat için süre "+ (System.currentTimeMillis()-startTime)+" ms");


        startTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba");
        }
        System.out.println("StringBuilder için süre "+ (System.currentTimeMillis()-startTime)+" ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("***********************\n\n");
        /****** StringBuilder'ı biraz yakından tanıyalım.***/

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Bugün ");
        stringBuilder.append("hava ");
        stringBuilder.append("güzel.");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        stringBuilder.append(4); // eklenen her şeyi toString hali var ise çevirerek ekler.
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.reverse(); // Stringi tersine çevirir
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.delete(0,5); // (index) 0 dahil, 5 hariç olmak üzere siler
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler.
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.insert(5,"kelime"); // 5 nolu index'e kelimeyi ekle : araya ekleme
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder=new StringBuilder("Bugün hava çok soğuk."); // sıfırlandı ve ilk değer atandı.
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.replace(3,8,"bu"); // verilen aralığı bu Stringle değiştir.
        System.out.println("stringBuilder = " + stringBuilder);

        String strStringBuilder=stringBuilder.toString();
        System.out.println("strStringBuilder = " + strStringBuilder);

        StringBuffer stringBuffer=new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı, paralel çalışan yazılımlarda, StringBuffer kullanılır.

    }
}
