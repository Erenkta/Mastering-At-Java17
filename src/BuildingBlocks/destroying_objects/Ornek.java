package BuildingBlocks.destroying_objects;

public class Ornek {
    Ornek n;

    public static void main(String[] args) {
        Ornek i2 = new Ornek();
        Ornek i3 = new Ornek();
        Ornek i4 = new Ornek();

        i2.n = i3;
        i3.n = i4;
        i4.n = i2;

        i2=null;
        i3=null;
        i4=null;

        // Burada aslında i2 i3 ve i4 referans ediliyor gibi düşünsek de
        // 2-Objenin tüm referansları scope dışında kalmalı
        //Birbirlerine referans ediyorlar ama dışarıya olan bağlantıları null
        // bu maddeye uymuyor çünkü baktığımız zaman i2 i3 ve i4 artık referans etmiyor.
        // Bundan dolayı 3 obje de garbage collector'a uygun
    }

}
