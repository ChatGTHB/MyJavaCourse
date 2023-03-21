package gun43;

import java.sql.SQLOutput;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        String str = "";
        // char ilkHarf = str.charAt(0);
        // Java bvurada try-catch olayını isteğe bağlı tutmuş : Unchecked Exception

        try {
            Thread.sleep(90000040);
        } catch (InterruptedException e) {
            System.out.println("Hata oluştu.");
        }

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.
    }
}