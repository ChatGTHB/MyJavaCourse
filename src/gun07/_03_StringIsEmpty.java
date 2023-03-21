package gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        //isEmpty: Bir Stringin içinde birşey var mı yok mu boolean olarak veriri
        String s1 = "Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());//false

        String s2 = " ";// boşluk karakteri A harfi gibi bir karakterdir.
        System.out.println("s2.isEmpty() = " + s2.isEmpty());//false

        String s3 = "";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());//true


    }
}
