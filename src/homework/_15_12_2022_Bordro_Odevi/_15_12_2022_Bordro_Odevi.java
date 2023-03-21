package homework._15_12_2022_Bordro_Odevi;

import java.util.ArrayList;
import java.util.Scanner;

public class _15_12_2022_Bordro_Odevi {
    public static void main(String[] args) {

        ArrayList<Bordro> calisanListesi = new ArrayList<Bordro>();

        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            Bordro calisan = new Bordro();

            System.out.print("Çalışanın tam adını giriniz : ");
            calisan.tamAdi = inputStr.nextLine();
            System.out.print("Çalışanın bordro numarasını giriniz : ");
            calisan.bordroNo = inputInt.nextInt();
            System.out.print("Çalışanın maaşını giriniz : ");
            calisan.maasi = inputInt.nextInt();

            calisanListesi.add(calisan);

        }
        calisanIsimleriniYazdir(calisanListesi);
        maasOrtalamasiniYazdir(calisanListesi);
        enFazlaVeEnAzMaasAlanlariYazdir(calisanListesi);

    }

    public static void enFazlaVeEnAzMaasAlanlariYazdir(ArrayList<Bordro> calisanListesi) {

        int enDusukMaas = calisanListesi.get(0).maasi;
        String enDusukMaasAlan = calisanListesi.get(0).tamAdi;

        int enYuksekMaas = calisanListesi.get(0).maasi;
        String enYuksekMaasAlan = calisanListesi.get(0).tamAdi;

        for (int i = 0; i < calisanListesi.size(); i++) {
            if (enYuksekMaas < calisanListesi.get(i).maasi) {
                enYuksekMaas = calisanListesi.get(i).maasi;
                enYuksekMaasAlan = calisanListesi.get(i).tamAdi;
            }
            if (enDusukMaas > calisanListesi.get(i).maasi) {
                enDusukMaas = calisanListesi.get(i).maasi;
                enDusukMaasAlan = calisanListesi.get(i).tamAdi;
            }
        }
        System.out.println("enYuksekMaas = " + enYuksekMaas);
        System.out.println("enYuksekMaasAlan = " + enYuksekMaasAlan);

        System.out.println("enDusukMaas = " + enDusukMaas);
        System.out.println("enDusukMaasAlan = " + enDusukMaasAlan);


    }

    public static void maasOrtalamasiniYazdir(ArrayList<Bordro> calisanListesi) {
        int toplamMaas = 0;
        for (Bordro maaslar : calisanListesi) {
            toplamMaas += maaslar.maasi;
        }
        int ortalama = toplamMaas / calisanListesi.size();
        System.out.println("Maaş ortalaması = " + ortalama);
    }

    public static void calisanIsimleriniYazdir(ArrayList<Bordro> calisanListesi) {
        for (Bordro calisanIsimleri : calisanListesi) {
            System.out.println("calisanIsimleri.tamAdi = " + calisanIsimleri.tamAdi);
        }
    }

}

class Bordro {
    int bordroNo;
    String tamAdi;
    int maasi;
}