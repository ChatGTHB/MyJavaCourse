package gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args){
        long startTime=0;
        String str="";

        try{ // Hata olasılığının olduğu kodlar
            startTime=System.currentTimeMillis();
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }catch(Exception ex){ // Hata olduğunda yapılacaklar
            System.out.println("Catch bloğu çalıştı.");
        }finally{// Hata olsa da olmasa da çalışır.
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("Geçen süre = " + gecenSure);
            System.out.println("Try-Catch bloğuyla ilgili son yapılacaklar...");
        }
        System.out.println("Diğer çalışan kodlar.");
        System.out.println("Program sonu...");
    }
}
