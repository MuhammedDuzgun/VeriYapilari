package video10;

import java.util.Scanner;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void basaEkle(int data) {

        Node node = new Node(data);

        if(head == null) {

            head = node;
            tail = node;

        } else {

            node.next = head;
            head.prev = node;
            head = node;

        }

    }

    void sonaEkle(int data) {

        Node node = new Node(data);

        if(head == null) {

            head = node;
            tail = node;

        } else {

            tail.next = node;
            node.prev = tail;
            tail = node;

        }


    }

    void yazdir() {

        Node tmp = head;

        if(head == null) {
            System.out.println("Liste Boş");
        } else {

            while (tmp != null) {

                System.out.print(tmp.data + " -> ");

                tmp = tmp.next;
            }
        }

    }

    //11.video içeriği araya ekleme
    void arayaEkle(int indis, int data) {

        Node node = new Node(data);

        if(head == null) {

            head = node;
            tail = node;

        } else if(head != null && indis == 0) {

            node.next = head;
            head.prev = node;
            head = node;

        } else {

            int i = 0;

            Node tmp = head;

            while(tmp != null) {

                i++;
                tmp = tmp.next;

            }

            tmp = head;

            if(indis >= i) {

                tail.next = node;
                node.prev = tail;
                tail = node;

            } else {

                int n = 0;

                while(n != indis) {

                    tmp = tmp.next;
                    n++;

                }

                node.prev = tmp.prev;
                tmp.prev.next = node;
                node.next = tmp;
                tmp.prev = node;

            }


        }



    }

    void sondanYazdir() {

        Node tmp = tail;

        if(tmp == null) {

            System.out.println("Liste Boş");

        } else {

            while(tmp != null) {

                System.out.print(tmp.data + " ->");
                tmp = tmp.prev;

            }

        }



    }

    //12.video içeriği baştan-sondan silme
    void bastanSil() {

        if(head != null) {

            if(head.next == null) {

                head = null;
                tail = null;

            } else {

                head = head.next;
                head.prev = null;

            }

        }

    }

    void sondanSil() {

        if(head != null) {

            if(head.next == null) {

                head = null;
                tail = null;

            } else {

                tail = tail.prev;
                tail.next = null;

            }


        }

    }

    //13.video içeriği aradan silme
     void aradanSil(int indis) {

        if(head != null) {

            if(head.next == null && indis <= 0) {

                head = null;
                tail = null;

            } else if(head.next != null && indis <= 0) {

                head = head.next;
                head.prev = null;

            } else {

                int n = 0;
                Node tmp = head;
                while(tmp.next != null) {

                    n++;
                    tmp = tmp.next;

                }

                if(indis >= n) {

                    tail = tail.prev;
                    tail.next = null;

                } else {

                    tmp = head;
                    int i = 0;

                    while(i<indis) {

                        i++;
                        tmp = tmp.next;

                    }

                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;


                }


            }

        }

     }

}
