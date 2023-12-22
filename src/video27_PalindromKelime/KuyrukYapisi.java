package video27_PalindromKelime;

public class KuyrukYapisi {

    Node front;
    Node rear;
    int size;
    int cnt;

    public KuyrukYapisi(int size) {
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
    }

    public void enQueue(char harf) {
        Node eleman = new Node(harf);
        if(isFull()) {
            System.out.println("Kuyruk Yapısı Dolu");
        } else {
            if(isEmpty()) {
                front = eleman;
                rear = eleman;
                System.out.println("Kuyruk yapısına ilk harf eklendi");
            } else {
                rear.next = eleman;
                rear = eleman;
                System.out.println("Kuyruk Yapısına eklendi");
            }
        }
        cnt++;
    }


    public char deQueue() {
        if(isEmpty()) {
            System.out.println("Kuyruk Yapısı Boş");
        } else {
            char harf = front.harf;
            front = front.next;
            cnt--;
            return harf;
        }
        return ' ';
    }

    public boolean isFull() {
        return cnt == size;
    }


    public boolean isEmpty() {
        return cnt == 0;
    }

}
