package video15;

import java.util.Scanner;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void basaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen data giriniz : "); int data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null) {

            head = eleman;
            tail = eleman;
            tail.next = head;

        } else {

            eleman.next = head;
            head = eleman;
            tail.next = eleman;

        }

    }

    void sonaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen data giriniz : "); int data = scanner.nextInt();
        Node eleman = new Node(data);

        if(head == null) {

            head = eleman;
            tail = eleman;
            tail.next = eleman;

        } else {

            tail.next = eleman;
            tail = eleman;
            tail.next = head;

        }

    }

    void arayaEkle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen indis giriniz : "); int indis = scanner.nextInt();
        System.out.println("Lütfen data giriniz  : "); int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null) {

            head = eleman;
            tail = eleman;
            tail.next = eleman;

        } else if(head != null && indis == 0) { //başa ekleme durumu

            eleman.next = head;
            head = eleman;
            tail.next = eleman;

        } else {

            Node tmp = head;
            int i = 1;

            while(tmp != tail) {

                i++;
                tmp = tmp.next;

            }

            if(indis >= i) { //sona ekleme durumu

                tail.next = eleman;
                tail = eleman;
                tail.next = head;

            } else { //araya ekleme durumu

                Node tmp2 = head;
                tmp = head;
                int n = 0;

                while(n != indis) {

                    n++;
                    tmp2 = tmp;
                    tmp = tmp.next;

                }

                tmp2.next = eleman;
                eleman.next = tmp;


            }

        }

    }

    void yazdir() {

        Node tmp = head;

        while(tmp != tail) {

            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;

        }

        System.out.println(tail.data);

    }

    //16.video içeriği silme operasyonlari

    void bastanSil() {

        if(head == null) {

            System.out.println("Liste Yapısı Boş");

        } else if(head != null && head.next == null) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            head = head.next;
            tail.next = head;

            System.out.println("Listenin başındaki eleman silindi");

        }

    }

    void sondanSil() {

        if(head == null) {

            System.out.println("Liste Yapısı Boş");

        } else if(head != null && head.next == null)  {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            Node tmp = head;
            Node tmp2 = head;


            while(tmp != tail) {

                tmp2 = tmp;
                tmp = tmp.next;

            }

            tmp2.next = null;
            tail = tmp2;
            tail.next = head;

        }

    }

    void aradanSil() {

        Scanner scanner = new Scanner(System.in);



        if(head == null) {

            System.out.println("Liste yapısı Boş");

        } else if(head != null && head.next == null) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else {

            System.out.println("Lütfen silmek istediğiniz indisi giriniz : ");
            int indis = scanner.nextInt();

            Node tmp = head;
            Node tmp2 = head;
            int i = 1;

            while (tmp != tail) {

                i++;
                tmp2 = tmp;
                tmp = tmp.next;

            }

            if(indis == 0) { //bastan silme durumu

                head = head.next;
                tail.next = head;

                System.out.println("Bastaki eleman silindi");

            } else if(indis == i) { //sondan eleman silme

                tmp2.next = null;
                tail = tmp2;
                tail.next = head;

            } else {

                tmp = head;
                tmp2 = head;

                int n = 0;

                while (n != indis) {

                    n++;
                    tmp2 = tmp;
                    tmp = tmp.next;

                }

                tmp2.next = tmp.next;


            }

        }


    }




}
