package gun31._02_Enum;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    public static void main(String[] args) {

        User user1 = new User("Mustafa", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Kerem", Role.MUDUR, Statu.AKTIF);
        User user3 = new User("Said", Role.SATIS, Statu.PASIF);

        User.userSil(user1);
        User.userSil(user2);
        User.userSil(user3);

        System.out.println("user1 = " + user1);
    }

}
