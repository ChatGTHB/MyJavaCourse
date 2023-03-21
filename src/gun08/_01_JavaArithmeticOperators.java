package gun08;

public class _01_JavaArithmeticOperators {
    public static void main(String[] args) {

        int a = 9;
        int b = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Toplama İşlemi");
        System.out.println("(a+b) = " + (a + b));//14

        System.out.println("Çıkarma İşlemi");
        System.out.println("(a-b) = " + (a - b));

        System.out.println("Çarpma İşlemi");
        System.out.println("(axb) = " + (a * b));

        System.out.println("Bölme İşlemi");
        System.out.println("(a/b) = " + (a / b));
        //normal sonuç 1.8 fakat tam sayının tam sayıya bölümünde küsurat atılır.
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz.

        System.out.println("(double) (a/b) = " + (double) a / b);

        System.out.println("Modül işlemi");
        System.out.println("a%b = " + a % b);
        System.out.println("b%a = " + b % a);
        //        kısa önemli not !
        //        Modül (%)'de
        //        sol büyük ise kalanı al
        //        sol küçükse solundakini al

    }
}
