package video27_PalindromKelime;

public class StackYapisi {

    Node top;
    int size;
    int cnt;

    public StackYapisi(int size) {
        this.size = size;
        top = null;
        cnt = 0;
    }

    public void push(char harf) {
        Node eleman = new Node(harf);
        if(isFull()) {
            System.out.println("Stack Yapisi Dolu");
        } else {
            if(isEmpty()) {
                top = eleman;
                System.out.println("Stack Yapsına ilk eleman eklendi");
            } else {
                eleman.next = top;
                top = eleman;
                System.out.println("Stack Yapısına eklendi");
            }
            cnt++;
        }
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack Yapısı Boş");
        } else {
            char harf = top.harf;
            top = top.next;
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
