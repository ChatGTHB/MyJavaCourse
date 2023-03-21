package gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        tekMiCiftMiOku();
    }
    private static void tekMiCiftMi(int number) {
        if(number%2!=0){
            System.out.println("Tek");
        }else{
            System.out.println("Çift");
        }
    }
    private static void tekMiCiftMiOku() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= input.nextInt();

        tekMiCiftMi(number);
    }

}
