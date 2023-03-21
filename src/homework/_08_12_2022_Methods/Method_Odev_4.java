package homework._08_12_2022_Methods;

public class Method_Odev_4 {
    public static void main(String[] args) {
//      4- adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java

        reverseWord("Adalet mülkün temelidir");
    }

    public static void reverseWord(String cumle) {
        String[] cumleArray =cumle.split(" ");

        for (int i = (cumleArray.length)-1; i >=0; i--) {
            System.out.print(cumleArray[i]+" ");

        }
    }
}
