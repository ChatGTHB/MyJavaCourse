package gun47.soru_08;

public class MyField {
    int x; // default 0
    int y; // default 0

    public void doStuff(int x, int y) {
        x = x; // parametreyi tekrar parametreye atadı, nesnenin kendi x'i değişmedi 0
        y = this.y; // nesnenin y'si değişmedi default değeri olan 0 kaldı

    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y); // 100 ile 200 gitti

        m1.display(); // 100 200
        m2.display(); // 0 0


    }
}
