package gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac = 0;

        sayac = sayac + 1;//1
        sayac++;//2
        ++sayac;//3

        sayac = sayac - 1;//2
        sayac--;//1
        --sayac;//0

        System.out.println("sayac = " + sayac);//0

        /*********************************************************/

        int toplam = 5 + sayac;//5
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//0

        toplam = 5 + sayac++;//toplam=5+sayac sonra sayac=sayac+1
        //toplam=5 ve sayac=1 oldu.
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//1

        toplam = 5 + ++sayac;//sayac=sayac+1 sonra toplam=5+sayac
        System.out.println("toplam = " + toplam);//7
        System.out.println("sayac = " + sayac);//2


    }
}
