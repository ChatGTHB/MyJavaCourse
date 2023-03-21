package homework._08_12_2022_Methods;

public class Method_Odev_3 {
    public static void main(String[] args) {
//     3 - reverseString isminde bir method oluşturun.
//        Bu method bir String 'i parametre olarak alsın.
//        Ve bu method, girilen String 'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn:
//        String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy 'avaJ

        reverseString("Java'yı Seviyorum.");
    }
    public static void reverseString(String cumle) {

        String terstenCumle="";
        for (int i = cumle.length()-1; i >=0; i--) {
            terstenCumle+=cumle.charAt(i);
        }
        System.out.println(terstenCumle);
    }
}
