package gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Ogrenci() {// yapıcı metodlar : Constructor methods
        System.out.println("Nesne oluşturuldu.");
    }// Nesne oluşturulurken yapmak istediklerin için burayı kullan

    public Ogrenci(int id, String ad, String soyad, int sinifi) {// yapıcı metodlar : Constructor methods
        this.id = id;// this.id : class'ın id'si, id: locak değişken parametre
        this.ad = ad;
        this.soyad = soyad;
        this.sinifi = sinifi;
    }

    public Ogrenci(int id, String ad, String soyad) {// yapıcı metodlar : Constructor methods
        this(id, ad, soyad, 0);// this öğrenci metodunun kendisi

        //this.id=id;
        //this.ad=ad;
        //this.soyad=soyad;
        //this.sinifi=0;
    }
}

//         mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metos ise Constructor yani yapıcı metodlar