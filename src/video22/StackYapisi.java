package video22;

public class StackYapisi {

    int size;
    int cnt;

    Node top;

    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data) {

        Node eleman = new Node(data);

        if(isFull()) {

            System.out.println("Stack yapısı Dolu");

        } else {

            if(isEmpty()) {

                top = eleman;
                System.out.println("İlk eleman eklendi : " + top.data);

            } else {

                eleman.next = top;
                top = eleman;

            }

            cnt++;

        }

    }

    void pop()  {

        if(isEmpty()) {

            System.out.println("Stack Yapısı Boş");

        } else {

            System.out.println(top.data + "Çıkarıldı");
            top = top.next;
            cnt--;

        }


    }

    void getTop() {

        if(isEmpty())
            System.out.println("Stack Yapısı boş");
        else
            System.out.println("Top Değeri : " + top.data);

    }

    void printStack() {

        Node tmp = top;

        if(isEmpty()) {
            System.out.println("Stack Yapısı boş");
        } else {

            while (tmp.next != null) {

                System.out.println(tmp.data);
                tmp = tmp.next;

            }

            System.out.println(tmp.data);

        }

    }

    boolean isFull() {

        return cnt == size;

    }

    boolean isEmpty() {

        return cnt == 0;

    }

}
