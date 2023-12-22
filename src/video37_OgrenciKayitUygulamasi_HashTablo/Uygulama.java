package video37_OgrenciKayitUygulamasi_HashTablo;

public class Uygulama {

    public static void main(String[] args) {

        HashTablo hashTablo = new HashTablo(7);

        hashTablo.ekle(1, "Muhammed", 50);
        hashTablo.ekle(2, "Mustafa", 90);
        hashTablo.ekle(3, "Mehmet", 95);
        hashTablo.ekle(4, "nuri", 45);
        hashTablo.ekle(5, "Sinan", 30);

        hashTablo.sil(5);
        hashTablo.yazdir();
        //hashTablo.ara(1);


    }

}
