package gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //Kullanıcının 2 kez gireceği şifresinin aynı olup olmadığını kontrol edin
        //AYNI veya DEĞİL şeklinde cevaplayınız. (confirm new password)

        Scanner input=new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password= input.nextLine();

        System.out.print("Re-enter your password :" );
        String repassword= input.nextLine();

        if(password.equals(repassword)){
            System.out.println("SAME");
        }
        if(!password.equals(repassword)) {
            System.out.println(" NOT SAME");
        }
    }
}
