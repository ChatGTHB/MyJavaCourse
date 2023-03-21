package gun47;

public class Soru_04 {
    public static void main(String[] args) {
        int n[][] = {{1, 3}, {2, 4}};
        // n.length 2'ye eşit
        for (int i = n.length - 1; i >= 0; i--) { // i : 1 0
            for (int y : n[i]) { // önce n[1] 2,4 ve sonra n[0] 1,3
                System.out.print(y);
            }
        }
    }
}
