package homework._08_12_2022_Methods;

public class Method_Odev_7 {
    public static void main(String[] args) {

//  7-  powerOfThree isminde bir method oluşturun.
//      Parametre olarak int
//      Return tipi boolean
//      Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin.
//      3'ün üssü(kuvveti) ise true, değilse false döndürün.
//      **Örnek 1:**
//      **Girdi:** 27
//      **Çıktı:** true
//      Açıklama: 3*3*3 =27
//      Sonuç= true

        System.out.println(powerOfThree(81));
    }

    public static boolean powerOfThree(int number) {

        boolean powerOfThree = false;

        for (int i = 0; i < number; i++) {
            if (Math.pow(3, i) == number) {
                powerOfThree = true;
                break;
            }
        }
        return powerOfThree;
    }
}
