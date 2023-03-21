package gun45;

public class Soru_04 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i].equals("D")) {
                System.out.print("Work done");
                break;
            }
            continue;
        }
    }
}
