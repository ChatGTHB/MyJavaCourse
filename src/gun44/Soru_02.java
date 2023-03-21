package gun44;

public class Soru_02 {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int i=0;

        do{
            System.out.print(arr[i]+ " ");
            i++;
        }while(i<arr.length+1);

        // Hata Mesajı= 1 2 3 4
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 4 out of bounds for length 4 at gun44.Soru_2.main(Soru_2.java:9)
    }
}
