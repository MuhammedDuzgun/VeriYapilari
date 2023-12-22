package video3;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void ekle(int data) {

        Node eklenecekNode = new Node();
        eklenecekNode.data = data;
        eklenecekNode.next = null;

        if(head == null) {

            head = eklenecekNode;
            tail = eklenecekNode;

            System.out.println("Liste Oluşturuldu ve başına yeni bir eleman eklendi");
        } else {

            tail.next = eklenecekNode;
            tail = eklenecekNode;


            System.out.println("Listenin sonuna yeni bir eleman eklendi");
        }

    }

    void listele() {

        if(head == null) {

            System.out.println("Liste Boş !");

        } else {

            Node tmp = head;

            while(tmp != null) {

                System.out.print(tmp.data + "  -> ");
                tmp = tmp.next;
            }

        }


    }

}













