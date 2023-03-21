package gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)


        double agirlik=88.4;
        int boy=172;

        double kitleIndex=agirlik/(boy*boy);

        System.out.println("Boyunuz = "+boy+" cm, kilonuz = "+agirlik+"'dir");
        System.out.println("Vücut kitle endeksiniz =" +kitleIndex+ "' dür/dir.");

        System.out.println("kitleIndex = " + kitleIndex);


    }
}
