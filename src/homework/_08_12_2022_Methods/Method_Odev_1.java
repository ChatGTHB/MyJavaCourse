package homework._08_12_2022_Methods;

public class Method_Odev_1 {
    public static void main(String[] args) {
        // 1- Ismi **randomNum** olan bir method oluşturun.
        //    Parametre olarak **int max** almalı.
        //    Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //    Random numarayı döndürünüz.

        int max = 10;
        System.out.println(randomNum(max));
    }

    public static int randomNum(int max) {
        return (int) (Math.random() * max);
    }
}
