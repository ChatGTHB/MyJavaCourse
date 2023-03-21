package gun19;
public class _08_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        int[]array=new int[20];
        diziDoldurYazdir(array);

    }
    private static void diziDoldurYazdir(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]);
        }
    }
}
