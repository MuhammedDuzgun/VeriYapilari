package video18;

import java.util.Scanner;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void basaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basa eklemek istediğiniz elemanın datasını giriniz : "); int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null) {

            head = eleman;
            tail = eleman;

            head.prev = tail;
            tail.next = head;
            head.next = tail;
            tail.prev = head;

            System.out.println("Listenin ilk elemanı eklendi");
        } else if(head != null && head.next == null) {

            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;

        } else {

            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;


        }

    }

    void sonaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sona eklemek istediğiniz elemanın datasını giriniz : "); int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null) {

            head = eleman;
            tail = eleman;

            head.next = tail;
            head.prev = tail;
            tail.next = head;
            tail.prev = head;

        } else {

            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            tail.next = head;
            head.prev = tail;

        }

    }

    void arayaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklemek istediğiniz indisi giriniz : "); int indis = scanner.nextInt();
        System.out.println("Eklemek istediğiniz datayı giriniz :"); int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null) {

            head = eleman;
            tail = eleman;

            head.next = tail;
            head.prev = tail;
            tail.next = head;
            tail.prev = head;

        } else if(head != null && indis == 0) { //basa ekleme durumu

            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;

        } else {

            Node tmp = head;
            int i = 1;

            while(tmp != tail) {

                i++;
                tmp = tmp.next;

            }

            if(indis == i) { //sona ekleme durumu

                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
                tail.next = head;
                head.prev = tail;

            } else {

                tmp = head;
                int n = 0;

                while(n != indis) {

                    n++;
                    tmp = tmp.next;

                }

                tmp.prev.next = eleman;
                eleman.prev = tmp.prev;
                eleman.next = tmp;
                tmp.prev = eleman;


            }

        }

    }

    void yazdir() {

        if(head == null) {

            System.out.println("Liste yapısı boş");

        } else {

            Node tmp = head;

            while(tmp != tail) {

                System.out.print(tmp.data + " -> ");

                tmp = tmp.next;

            }

            System.out.print(tmp.data);

        }

    }

    void terstenYazdir() {

        if(head == null) {

            System.out.println("Liste Yapısı boş");

        } else {

            Node tmp = tail;

            while (tmp != head) {

                System.out.print(tmp.data + " -> ");

                tmp = tmp.prev;

            }

            System.out.print(tmp.data);

        }

    }

    //video 19 icerigi silme operasyonları

    void bastanSil() {

        if(head == null) {

            System.out.println("Liste yapısı boş");

        } else if(head != null && head.next == null) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            head = head.next;
            head.prev = tail;
            tail.next = head;

        }

    }

    void sondanSil() {

        if(head == null) {

            System.out.println("Liste yapısı boş");

        } else if(head != null && head.next == null) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            tail = tail.prev;
            tail.next = head;
            head.prev = tail;

        }

    }

    void aradanSil() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz indisi giriniz : "); int indis = scanner.nextInt();

        if(head == null)  {

            System.out.println("Liste Yapısı boş");

        } else if(head != null && head.next == null && indis == 0) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            Node tmp = head;
            int n = 0;

            while (tmp != tail) {

                n++;
                tmp = tmp.next;

            }

            if(indis == n) { //sondan silme durumu

                tail = tail.prev;
                tail.next = head;
                head.prev = tail;

            } else {

                n = 0;
                tmp = head;

                while(n != indis) {

                    n++;
                    tmp = tmp.next;

                }

                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;

            }


        }

    }


}
