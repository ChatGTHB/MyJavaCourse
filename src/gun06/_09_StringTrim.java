package gun06;

public class _09_StringTrim {
    public static void main(String[] args) {
        // trim : String başındaki ve sonundaki boşlukları alır.

        String text= "   Merhaba Dünya   ";

        System.out.println("text = -> " + text+"<-");
        System.out.println("text.trim() = ->" + text.trim()+"<-");
    }
}
