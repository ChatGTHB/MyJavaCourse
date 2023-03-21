package gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.Random(): double sayı üretir. 0-0.999999999 arası üretiyor.

        double randomNumber0_1=Math.random();
        System.out.println("randomNumber0_1 = " + randomNumber0_1);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0-5.9999999
        // int çevirirsem 0-5;

        int randomNumber0_6= (int) (Math.random()*6);
        System.out.println("randomNumber0_6 = " + randomNumber0_6);
    }
}
