package gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        // 4-9 arası nasıl ürettirirdim
        // Yöntem şu : önce aralık kadar kadar normal üret (9-4)  yani 0-5 arası
        // üretilmiş olan sayıya min sayıyı ekle , üretilmiş sayı + 4
        //  (int)(Math.Random()*(max-min))+min

        //Girilen max ve min aralığında random sayı ürettiririniz.
        Scanner input=new Scanner(System.in);

        System.out.print("min =");
        int min= input.nextInt();

        System.out.print("max =");
        int max= input.nextInt();

        int randomNumber= (int) (Math.random()*(max-min))+min;
        System.out.println("randomNumber = " + randomNumber);


    }
}
