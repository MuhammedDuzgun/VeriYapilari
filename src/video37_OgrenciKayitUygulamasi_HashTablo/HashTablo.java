package video37_OgrenciKayitUygulamasi_HashTablo;

public class HashTablo {

    OgrNode[] dizi;
    int size;

    public HashTablo(int size) {
        this.size = size;
        dizi = new OgrNode[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new OgrNode();
        }
    }

    int indeksHesapla(int key) {
        return key % size;
    }

    void ekle(int no, String ad, int ortalama) {
        int indeks = indeksHesapla(no);

        OgrNode eleman = new OgrNode(no, ad, ortalama);
        OgrNode tmp = dizi[indeks];

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = eleman;
        System.out.println(ad + " eklendi");
    }

    void sil(int no) {
        int indis = indeksHesapla(no);
        OgrNode tmp = dizi[indis];
        OgrNode tmp2 = dizi[indis];

        if(tmp.next == null) {
            System.out.println(no + " Numaralı öğrenci kaydı bulunmamaktadır.");
        } else if(tmp.next.next == null && tmp.next.no == no) {
            tmp.next = null;
            System.out.println(no + " Numaralı öğrenci kaydı silindi. Bu indisteki son kayıttı");
        } else {
            while(tmp.next != null) {
                tmp2 = tmp;
                tmp = tmp.next;

                if(tmp.no == no) {
                    tmp2.next = tmp.next;
                    System.out.println(no + " Numaralı öğrenci kaydı silindi");
                }
            }
        }
    }

    void yazdir() {
        System.out.println("Numara \t" + "Ad\t" + "Ort \t" + "Durum \t");
        for (int i = 0; i < size; i++) {
            OgrNode tmp = dizi[i];

            while (tmp.next != null) {
                System.out.println(tmp.next.no + "\t" + tmp.next.ad + "\t" + tmp.next.ort + "\t" + tmp.next.durum);
                tmp = tmp.next;
            }
        }
    }

    void ara(int no) {
        int indis = indeksHesapla(no);

        OgrNode tmp = dizi[indis];

        if(tmp.next == null) {
            System.out.println(no + " numaralı kayıt bulunmamaktadır.");
        }

        while (tmp.next != null) {
            if(tmp.next.no == no) {
                System.out.println(no + " nolu öğrenci bilgileri :");
                System.out.println("Ad : " +tmp.next.ad);
                System.out.println("Ortalama : " +tmp.next.ort);
                System.out.println("Durum : " +tmp.next.durum);
                break;
            }
            tmp = tmp.next;
        }

    }

}
