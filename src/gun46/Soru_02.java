package gun46;

public class Soru_02 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4]; // 2. boyut yani sütun aşağıda yeniden boyutlandırılıyor
        arr[0] = new int[]{1, 3, 5, 7}; // satır 0 ; bu satırı yeniden oluşturuyor
        arr[1] = new int[]{1, 3}; // satır 1 ; bu satırı yeniden oluşturuyor

        for (int[] a : arr) {
            for (int i=0;i< arr.length;i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
//        1 3
//        1 3

    }
}
