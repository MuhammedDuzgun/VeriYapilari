package video23_KursKayitUygulamasi;

public class KursNode {

    String tc;
    String ad;
    String soyad;
    String bolum;

    KursNode next;

    public KursNode(String tc, String ad, String soyad, String bolum) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.next = null;
    }

    @Override
    public String toString() {
        return "KursNode{" +
                "tc='" + tc + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}
