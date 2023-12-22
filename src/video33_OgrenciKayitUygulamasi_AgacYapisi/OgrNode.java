package video33_OgrenciKayitUygulamasi_AgacYapisi;

public class OgrNode {

    int no;
    int not;
    String ad;

    OgrNode left;
    OgrNode right;

    public OgrNode() {
        no = 0;
        not = 0;
        ad = "";
        left = null;
        right = null;
    }

    public OgrNode(int no, int not, String ad) {
        this.no = no;
        this.not = not;
        this.ad = ad;
        left = null;
        right = null;
    }
}
