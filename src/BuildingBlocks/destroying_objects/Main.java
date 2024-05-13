package BuildingBlocks.destroying_objects;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String one,two;
        one = new String("a");
        two = new String("b");
        // Şu an itibariyle iki objemiz var heapte biri a biri b
        // one ve two bu ikisine referans ediyor
        one = two; // burada diyoriz ki one artık b objesine referans etsin
        // bu satır itibariyle de artık a objesini gösteren bir referansımız yok yani garbage collector devrede.


        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        // Buraya kadar obje garbage collector'a göre sahipsiz değil
        sb = null;
        // Artık objeyi gösteren bir referans yok. Obje garbage collector'a uygun


        // Örnek 3
        Date d = getDate();
        // burada getDate()'den dolayı hem date hem de String objesi heap'te var
        // method bitiminde String objesine ihtiyaç yok diye garbage collector bu objeyi alabilir
        // Fakat method Date'i dönmesine rağmen ilerde kullanacağımız için
        // date objesi hala garbage collector'a uygun değil

        doSomeStuff();
        System.out.println("d = "+d);

        // GC ile alakalı methodlar
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM Memory = "+ rt.totalMemory());
        System.out.println("Before Memory = "+rt.freeMemory());

        Date time = null;
        for(int i = 0 ; i<10000;i++){
            time = new Date();
            time = null;
        }
        System.out.println("After Memory = "+rt.freeMemory());

        rt.gc(); // System.gc'ye alternatif
        System.out.println("After GC Memory = "+rt.freeMemory());


    }

    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }
    private static void doSomeStuff(){

    }
}

