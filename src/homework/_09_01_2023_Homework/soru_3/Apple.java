package homework._09_01_2023_Homework.soru_3;
public class Apple extends Phone {

    @Override
    void options(String str1, String str2) {
        switch (str1) {
            case "1":
                Phone.cart.add("$750");
                break;
            case "2":
                Phone.cart.add("$850");
                break;
            case "3":
                Phone.cart.add("$950");
                break;
            case "4":
                Phone.cart.add("$1200");
                break;
            default:
                break;
        }
    }

}
