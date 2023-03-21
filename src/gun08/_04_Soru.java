package gun08;

public class _04_Soru {
    public static void main(String[] args) {
        // 2022(dahil) yılına kadar geçen gun miktarını bulunuz.
        // 0 dan 2022 yılına kadar
        // 1 yılda 365 gün
        // 4 yılda bir-> 1 gün extra

        int gun=(2022*365)+(2022/4);
        System.out.println("gun = " + gun);
    }
}
