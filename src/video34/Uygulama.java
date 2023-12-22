package video34;

public class Uygulama {

    public static void main(String[] args) {

        HashTablo hashTablo = new HashTablo(5);

        hashTablo.ekle(0, "Ahmet");
        hashTablo.ekle(10, "Mehmet");
        hashTablo.ekle(3, "Mustafa");
        hashTablo.ekle(4, "Mithat");
        hashTablo.ekle(2, "Murat");
        hashTablo.ekle(22, "Abdullah");
        hashTablo.ekle(15, "Emrullah");
        hashTablo.ekle(9, "yusuf");
        hashTablo.ekle(1, "faik");

        System.out.println(hashTablo.dizi[2].next.next.isim);

        hashTablo.yazdir();

    }

}
