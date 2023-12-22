package video26_PideciKuyrugu;

public class Uygulama {

    public static void main(String[] args) {

        KuyrukYapisi kuyrukYapisi = new KuyrukYapisi(10);

        kuyrukYapisi.enQueue("Muhammed" , 5);
        kuyrukYapisi.enQueue("Emrullah" , 1);
        kuyrukYapisi.enQueue("Abdullah" , 3);
        kuyrukYapisi.enQueue("Esmanur" , 2);
        kuyrukYapisi.enQueue("Ayşegül" , 2);

        kuyrukYapisi.yazdir();

        kuyrukYapisi.deQueue();
        kuyrukYapisi.deQueue();
        kuyrukYapisi.deQueue();

        kuyrukYapisi.yazdir();
        System.out.println("Toplam gelir: " + kuyrukYapisi.toplamGelir);

    }

}
