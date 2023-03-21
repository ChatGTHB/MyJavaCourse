package homework._08_12_2022_Methods;

public class Method_Odev_5 {
    public static void main(String[] args) {

//  5- EvenOddNums isminde bir method oluşturun.
//     Bu yöntem String olan bir parametreyi kabul etsin.
//     Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//     Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//     toplam sonucu yazdırın.
//     **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//     For example Örnek:
//     String =  "6678421312"
//     6+6-7+8+4+2-1-3-1+2
//     sonuç 16 olmalı

        evenOddNums("6678421312");

    }

    public static void evenOddNums(String str) {
        int strInt;
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            strInt = Integer.parseInt(str.substring(i, i + 1));
            if (strInt % 2 != 0) {
                toplam -= strInt;
            } else {
                toplam += strInt;
            }
        }
        System.out.println("Toplam = " + toplam);
    }
}
