package gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        //100'e kadar (100 dahil) olan sayıların toplamını bulunuz.

        int total = 0;
        int counter = 1;

        while (counter <= 100) {
            total += counter;
            counter++;
        }
        System.out.println("Total = " + total);
    }
}
