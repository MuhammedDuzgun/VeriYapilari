package video4;

public class ListeYapisi {

    Node head;
    Node tail;

    public ListeYapisi() {
        head = null;
        tail = null;
    }

     void basaEkle(int data) {

        Node eklenecekNode = new Node();
        eklenecekNode.data = data;
        eklenecekNode.next = null;

        if(head == null) {

            head = eklenecekNode;
            tail = eklenecekNode;

        } else {

            eklenecekNode.next = head;
            head = eklenecekNode;
        }


    }

    void sonaEkle(int data) {

        Node eklenecekNode = new Node();
        eklenecekNode.data = data;
        eklenecekNode.next = null;

        if(head == null) {

            head = eklenecekNode;
            tail = eklenecekNode;

        } else {

            tail.next = eklenecekNode;
            tail = eklenecekNode;

        }


    }

    void listele() {

        if(head == null) {

            System.out.println("Liste Yapısı Boştur");

        } else {

            Node tmp = head;

            while(tmp != null) {

                System.out.print(tmp.data + " -> ");
                tmp = tmp.next;
            }

        }

    }

    //5.video içeriği araya ekle metodu

    void arayaEkle(int indis, int data) {

        Node eklenecekNode = new Node();
        eklenecekNode.data = data;
        eklenecekNode.next = null;

        if(head == null && indis == 0) {

            head = eklenecekNode;
            tail = eklenecekNode;

        } else if(head != null && indis == 0) {

            eklenecekNode.next = head;
            head = eklenecekNode;

        } else {

            int n = 0;
            Node tmp = head;
            Node tmp2 = head;

            while (tmp.next != null) {

                n++;
                tmp2 = tmp;
                tmp = tmp.next;

            }

            if(n == indis) {

                tmp2.next = eklenecekNode;
                eklenecekNode.next = tmp;

            } else {

                tmp = head;
                tmp2 = head;
                int i = 0;

                while(i != indis) {

                    tmp2 = tmp;
                    tmp = tmp.next;
                    i++;

                }

                eklenecekNode.next = tmp;
                tmp2.next = eklenecekNode;



            }


        }


    }

    //6.Video içeriği baştan ve sondan eleman silme
    void bastanSil() {

        if(head == null) {

            System.out.println("Liste boş");


        } else if(head.next == null) {

            head = null;
            tail = null;
            System.out.println("Listedeki tek elemanda silindi.");
        } else {

            head = head.next;

            System.out.println("Baştaki eleman Silindi");
        }

    }

    void sondanSil() {

        if(head == null) {

            System.out.println("Liste boş");

        } else if(head.next == null) {

            head = null;
            tail = null;

            System.out.println("Listedeki tek eleman silindi");
        } else {

            Node tmp = head;
            Node tmp2 = head;

            while (tmp.next != null) {

                tmp2 = tmp;
                tmp = tmp.next;

            }

            tmp2.next = null;
            tail = tmp2;

            System.out.println("Listenin sonuncu elemanı Silindi");
        }

    }

    //7.Video içeriği aradan eleman silme
    void aradanSil(int indis) {

        if(head == null) {

            System.out.println("Liste Boş");

        } else if(head.next == null && indis == 0) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı da silindi");

        } else if(head.next != null && indis == 0) {

            head = head.next;

            System.out.println("Baştaki eleman silindi");

        } else {

            int i = 0;
            Node tmp = head;
            Node tmp2 = head;

            while(tmp.next != null) {

                i++;
                tmp2 = tmp;
                tmp = tmp.next;

            }

            if(i == indis) {

                tmp2.next = null;
                tail = tmp2;

                System.out.println("Listenin sonundaki eleman silindi");

            } else {

                tmp = head;
                tmp2 = head;

                int j = 0;

                while( j != indis) {

                    tmp2 = tmp;
                    tmp = tmp.next;
                    j++;

                }

                tmp2.next = tmp.next;

                System.out.println("Aradaki eleman silindi");
            }

        }

    }




}
