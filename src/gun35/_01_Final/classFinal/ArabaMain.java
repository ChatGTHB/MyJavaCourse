package gun35._01_Final.classFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Tasitlar t1=new Tasitlar();
        t1.model="opel";

        Tasitlar t2=new Tasitlar();
        t2.model="honda";
        // kullanım kısmında bir sınırlama yok

        // class final olursa eğer
        // mainde birden fazla çağrılabilir
        // fakat başka class'a extend edilemez

    }
}
