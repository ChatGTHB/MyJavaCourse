package gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        //concat : bir String ile diğerini birleştiriyor.

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birleşik hali : "+s1+s2);//MerhabaDünya
        System.out.println("birleşik hali : "+s1.concat(s2));//MerhabaDünya
        System.out.println("birleşik hali : "+s1.concat(" ").concat(s2));//Merhaba Dünya
        System.out.println("birleşik hali : "+s1.concat(" "+s2));//Merhaba Dünya
        System.out.println("birleştirme: "+s1.concat(" Jüpiter "));//Merhaba Jüpiter

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }
}
