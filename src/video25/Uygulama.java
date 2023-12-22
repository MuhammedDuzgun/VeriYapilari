package video25;

public class Uygulama {

    public static void main(String[] args) {

        KuyrukYapisi kuyrukYapisi = new KuyrukYapisi(5);

        kuyrukYapisi.enqueue(10);
        kuyrukYapisi.enqueue(20);
        kuyrukYapisi.enqueue(30);
        kuyrukYapisi.enqueue(40);

        kuyrukYapisi.yazdir();



    }

}
