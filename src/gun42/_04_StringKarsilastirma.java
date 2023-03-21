package gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // Stringlerde neden == yerine equals kullanılıyor?
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        // İLKEL tipler karşılaştırıldığında 2'sinde de değerleri karşılaştırır.
        // Çünkü başka bir şeyi yok.
        if(cumle1==cumle2){
            System.out.println("Cümle1 Cümle2'ye eşit.");
        }else{
            System.out.println("Cümle1 Cümle2'ye eşit DEĞİL.");
        }

        if(cumle1.equals(cumle2)){
            System.out.println("Cümle1 Cümle2'ye eşit.");
        }else{
            System.out.println("Cümle1 Cümle2'ye eşit DEĞİL.");
        }

        //**********Referans TİPLERDE ise durum farklıdır.****/
        // scanner'le ekrandan okunduğunda aşağıdaki gibi oluyor.
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if(cumle3==cumle4){ // adresleri karşılaştırır
            System.out.println("Cümle3 Cümle4'e eşit.");
        }else{
            System.out.println("Cümle3 Cümle4'e eşit DEĞİL.");
        }

        if(cumle3.equals(cumle4)){ // değerleri aynı mı
            System.out.println("Cümle3 Cümle4'e eşit.");
        }else{
            System.out.println("Cümle3 Cümle4'e eşit DEĞİL.");
        }
    }
}
