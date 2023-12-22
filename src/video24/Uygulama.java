package video24;

public class Uygulama {

    public static void main(String[] args) {

        KuyrukYapisi kuyrukYapisi = new KuyrukYapisi(5);

        kuyrukYapisi.enQueue(10);
        kuyrukYapisi.enQueue(20);
        kuyrukYapisi.enQueue(30);
        kuyrukYapisi.enQueue(40);


        kuyrukYapisi.elemanSayisi();

        kuyrukYapisi.yazdir();

        System.out.println("Kuyruğun başındaki eleman : " + kuyrukYapisi.dizi[kuyrukYapisi.front]);
        System.out.println("Kuyruğun sonundaki eleman : " + kuyrukYapisi.dizi[kuyrukYapisi.rear]);

    }

}
