package gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye (ArrayList) atayarak
        // yazdırınız.

        ArrayList<Integer> tekList = new ArrayList<>();

        Scanner input=new Scanner(System.in);

        int[]array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.print(" Enter a number : ");
            array[i]=input.nextInt();
            if(array[i]%2!=0){
                tekList.add(array[i]);
            }
        }
        System.out.println("tekList = " + tekList);
    }
}
