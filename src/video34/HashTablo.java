package video34;

public class HashTablo {

    Node[] dizi;
    int size;

    public HashTablo(int size) {
        this.size = size;
        dizi = new Node[size];

        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();
        }
    }

    int indexUret(int key) {
        return key % size;
    }

    void ekle(int key, String isim) {
        int index = indexUret(key);

        Node eleman = new Node(key, isim);
        Node tmp = dizi[index];

        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = eleman;

        System.out.println(eleman.isim + " eklendi.");
    }

    //video35 - silme
    void sil(int key) {
        int index = indexUret(key);
        Node tmp = dizi[index];
        Node tmp2 = dizi[index];

        if(tmp.next == null) {
            System.out.println(key + " numaralı kayıt bulunmamaktadır.");
        } else if(tmp.next.next == null && tmp.next.key == key) {
            tmp.next = null;
            System.out.println(key + " Numaralı kayıt silindi, bu kayıt indisteki son kayıttı.");
        } else {
            while(tmp.next != null) {
                tmp2 = tmp;
                tmp = tmp.next;
                if(tmp.key == key) {
                    tmp2.next = tmp.next;
                    System.out.println(key + " Numaralı kayıt silindi");
                }
            }
        }

    }

    //video36 - yazdırma
    void yazdir() {
        for (int i = 0; i < size; i++) {
            Node tmp = dizi[i];

            System.out.print("indis " + i + " :");
            while (tmp.next != null) {
                System.out.print(tmp.next.key + " - " + tmp.next.isim + " -> ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }


}
