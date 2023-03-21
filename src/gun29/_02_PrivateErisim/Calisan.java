package gun29._02_PrivateErisim;

public class Calisan {
    int id;         // default
    String name;    // default
    String surname; // default
    private String password;// private
    // sadece bulunduğu class'tan erişim izni var.

    public void sifreAta(String sifre) {
        // şifreyi kontrol ederek atayacağım.
        if (sifre.length() < 8) {
            System.out.println("Zayıf şifre");
        } else {
            password = sifre;
            System.out.println("Şifre başarıyla oluşturuldu.");
        }
    }


    public void sifreGoster() {
        System.out.println("****" + password.substring(4));
    }
}

