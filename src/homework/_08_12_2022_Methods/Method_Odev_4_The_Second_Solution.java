package homework._08_12_2022_Methods;

import java.util.ArrayList;

public class Method_Odev_4_The_Second_Solution {
    public static void main(String[] args) {
//      4- adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java

        System.out.println(reverseWord("Adalet mülkün temelidir"));
    }

    public static ArrayList<String> reverseWord(String cumle) {
        String[] cumleArray =cumle.split(" ");
        ArrayList<String>cumleArrayList=new ArrayList<>();
            int j=0;
        for (int i = (cumleArray.length)-1; i >=0; i--) {
                cumleArrayList.add(cumleArray[i]);
                j++;
        }
       return cumleArrayList;
    }
}
