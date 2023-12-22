package video25;

import java.util.Scanner;

public class KuyrukYapisi {

    Node front;
    Node rear;

    int size;
    int cnt; //(counter)

    public KuyrukYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    public void enqueue(int data) {

        if(isFull()) {
            System.out.println("Kuyruk Yapısı Dolu ");
        } else {
            Node eleman = new Node(data);

            if(isEmpty()) {
                front = eleman;
                rear  = eleman;
                System.out.println("Kuyruğa ilk eleman eklendi");
            } else {
                rear.next = eleman;
                rear = rear.next;
                eleman.next = null;
                System.out.println("Kuyruğa eklendi");
            }
            cnt++;
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Kuyruk Yapısı Boş");
        } else {
            System.out.println(front.data + " Kuyrukran Silindi");
            front = front.next;
            cnt--;
        }
    }

    public void yazdir() {

        if(isEmpty()) {
            System.out.println("Kuyruk Yapısı Bos");
        } else {
            Node tmp = front;
            while(tmp.next != null) {
                System.out.print(tmp.data + " <- ");
                tmp = tmp.next;
            }
            System.out.print(tmp.data);
        }


    }


    public boolean isFull() {
        return cnt == size;
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

}
