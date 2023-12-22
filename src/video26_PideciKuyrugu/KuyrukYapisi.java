package video26_PideciKuyrugu;

public class KuyrukYapisi {

    NodePide front;
    NodePide rear;
    int size;
    int cnt;
    int toplamGelir;

    public KuyrukYapisi(int size) {
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
    }

    public void enQueue(String isim, int adet) {
        NodePide eleman = new NodePide(isim, adet);
        if(isFull()) {
            System.out.println("Kuyruk Sırası Dolu");
        } else {
            if(isEmpty()) {
                front = eleman;
                rear = eleman;
                System.out.println("Kuyruğa ilk müşteri eklendi.");
            } else {
                rear.next = eleman;
                rear = eleman;
                System.out.println("Müşteri Kuyruğa eklendi");
            }
            cnt++;
        }
    }

    public void deQueue() {
        if(isEmpty()) {
            System.out.println("Kuyrukta müşteri bulunmamakta.");
        } else {
            toplamGelir += front.ucret;
            System.out.println(front.isim + " " + front.adet + " adet pide aldı, toplam borcu : " + front.ucret + " TL");
            front = front.next;
            cnt--;
        }
    }

    public void yazdir() {
        NodePide tmp = front;
        while(tmp.next != null) {
            System.out.print(tmp + " <- ");
            tmp = tmp.next;
        }
        System.out.println(tmp);
    }


    public boolean isFull() {
        return cnt == size;
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

}
