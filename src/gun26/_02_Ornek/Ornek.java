package gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


        Person worker1 = new Person();
        worker1.name = "Kayra";
        worker1.surname = "Çelikbilek";
        worker1.age = 35;

        Person worker2 = new Person();
        worker2.name = "Kazım";
        worker2.surname = "Demirbilek";
        worker2.age = 47;


        System.out.println("==========The First Solution=============\n");
        // 1.Yöntem
        System.out.println("worker1.name = " + worker1.name);
        System.out.println("worker1.surname = " + worker1.surname);
        System.out.println("worker1.age = " + worker1.age);
        System.out.println();
        System.out.println("worker2.name = " + worker2.name);
        System.out.println("worker2.surname = " + worker2.surname);
        System.out.println("worker2.age = " + worker2.age);
        System.out.println();

        System.out.println("==========The Second Solution=============\n");
        // 2.Yöntem
        bilgiYazdir(worker1);
        System.out.println();
        bilgiYazdir(worker2);
        System.out.println();

        System.out.println("==========The Third Solution=============\n");
        // 3.Yöntem, metodu olduğu class dan çağırıyoruz.
        worker1.bilgiYazdir();
        System.out.println();
        worker2.bilgiYazdir();
        System.out.println();

      //int[]dizi=new int[5];
      //System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

      //ArrayList<Integer>liste=new ArrayList<>();
      //System.out.println("liste = " + liste/*.toString()*/);

        System.out.println("==========The Fourth Solution=============\n");
        // 4.Yöntem
        System.out.println("worker1 = " + worker1);
        System.out.println("worker2 = " + worker2);
        System.out.println();

        //getBirthYear ve getBirthYear2 metodları ile doğum tarihlerini yazdırma
        worker1.getBirthYear();
        System.out.println(worker2.getBirthYear2());
        System.out.println();

        //getInitials isminde kişinin adının ilk harfi.s oyadının ilk harfi
        // şeklinde (Büyük harf) veren metod ile yazdırma
        worker1.getInitials();
        worker2.getInitials();
    }

    public static void bilgiYazdir(Person worker) {
        System.out.println("worker.name = " + worker.name);
        System.out.println("worker.surname = " + worker.surname);
        System.out.println("worker.age = " + worker.age);
    }
}
