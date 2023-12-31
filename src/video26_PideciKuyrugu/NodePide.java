package video26_PideciKuyrugu;

public class NodePide {

    String isim;
    int adet;
    int ucret;
    NodePide next;

    public NodePide(String isim, int adet) {
        this.isim = isim;
        this.adet = adet;
        ucret = adet * 4;
        next = null;
    }

    @Override
    public String toString() {
        return "NodePide{" +
                "isim='" + isim + '\'' +
                ", adet=" + adet +
                ", ucret=" + ucret +
                '}';
    }
}
