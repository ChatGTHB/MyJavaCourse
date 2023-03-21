package gun39._05_OOP_Soru;

import utility.MyFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> foods = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int userChoice;
        do {
            System.out.println("***========<<TechnoCafe>>=========***");
            System.out.println("***============*Menü*=============***");
            System.out.println("1-Adana Kebap (55 TL)\n2-Lahmacun (33 TL)\n3-Borsh (33 TL)\n4-Palov (44 TL)\n0-Tamam");
            System.out.print("Siparişinizi giriniz : ");
            userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    AdanaKebap adanaKebap = new AdanaKebap();
                    System.out.print("Adana Kebap siparişiniz alınıyor.\n" + "Sipariş adedinizi giriniz : ");
                    int numberOfOrders = input.nextInt();
                    for (int i = 0; i < numberOfOrders; i++) {
                        foods.add(adanaKebap);
                    }
                    break;
                case 2:
                    Lahmacun lahmacun = new Lahmacun();
                    System.out.print("Lahmacun siparişiniz alınıyor.\n" +
                            "Sipariş adedinizi giriniz : ");
                    numberOfOrders = input.nextInt();
                    for (int i = 0; i < numberOfOrders; i++) {
                        foods.add(lahmacun);
                    }
                    break;
                case 3:
                    Borsh borsh = new Borsh();
                    System.out.print("Borsh siparişiniz alınıyor.\n" +
                            "Sipariş adedinizi giriniz : ");
                    numberOfOrders = input.nextInt();
                    for (int i = 0; i < numberOfOrders; i++) {
                        foods.add(borsh);
                    }
                    break;
                case 4:
                    Palov palov = new Palov();
                    System.out.print("Palov siparişiniz alınıyor.\n" +
                            "Sipariş adediniz giriniz : ");
                    numberOfOrders = input.nextInt();
                    for (int i = 0; i < numberOfOrders; i++) {
                        foods.add(palov);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Hatalı seçim yaptınız.\n");
            }

        } while (userChoice != 0);

        MyFunc.bekle(2);
        double foodFee = 0;
        for (IFood food : foods) {
            TechnoKitchen.hazirla(food);
            foodFee += food.ucret();
            MyFunc.bekle(2);
        }
        System.out.println("Sepetinizde " + foods.size() + " adet ürün var.");
        System.out.println("Hesap = " + foodFee + " TL");


    }
}
