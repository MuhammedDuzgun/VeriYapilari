package video24;

public class KuyrukYapisi {

    int[] dizi;
    int size;
    int front; //kuyruğun başındaki eleman
    int rear;  //kuyruğun sonundaki eleman

    public KuyrukYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int data) {

        if(isFull()) {
            System.out.println("Kuyruk Yapısı Dolu");
        } else {
            rear++;
            dizi[rear] = data;
            System.out.println(rear + ". değer kuyruğa eklendi: " + dizi[rear]);
        }


    }



    void dequeue() {

        if(isEmpty()) {
            System.out.println("Kuyruk Yapısı Boş, Silinecek eleman bulunmamaktadır.");
        } else {

            int sayiFront = dizi[front];

            for (int i=1; i<=rear; i++) {
                dizi[i-1] = dizi[i];
            }
            rear--;

            System.out.println(sayiFront + " kuyruktan silindi");
        }

    }

    public void elemanSayisi() {
        System.out.println("Eleman Sayisi : " + (rear+1));
    }

    public void yazdir() {
        int i = rear;
        while (i >= 0) {
            System.out.print(dizi[i] + " -> ");
            i--;
        }
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull() {
        return rear == size-1;
    }

}
