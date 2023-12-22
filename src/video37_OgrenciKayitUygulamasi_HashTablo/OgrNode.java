package video37_OgrenciKayitUygulamasi_HashTablo;

public class OgrNode {

    int no;
    String ad;
    int ort;
    String durum;
    OgrNode next;

    public OgrNode() {
        next = null;
    }

    public OgrNode(int no, String ad, int ort) {
        this.no = no;
        this.ad = ad;
        this.ort = ort;
        this.durum = ort < 50 ? "Kaldı" : "Geçti";
        next = null;
    }
}
