package video20_OtoparkKayitUygulamasi;

public class OtoNode {

    String plaka;
    String giris;
    String cikis;
    long dakika;
    long ucret;

    OtoNode next;
    OtoNode prev;


    public OtoNode(String plaka, String giris) {
        this.plaka = plaka;
        this.giris = giris;
        this.next = null;
        this.prev = null;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getGiris() {
        return giris;
    }

    public void setGiris(String giris) {
        this.giris = giris;
    }

    public String getCikis() {
        return cikis;
    }

    public void setCikis(String cikis) {
        this.cikis = cikis;
    }

    public long getDakika() {
        return dakika;
    }

    public void setDakika(long dakika) {
        this.dakika = dakika;
    }

    public long getUcret() {
        return ucret;
    }

    public void setUcret(long ucret) {
        this.ucret = ucret;
    }

    public OtoNode getNext() {
        return next;
    }

    public void setNext(OtoNode next) {
        this.next = next;
    }

    public OtoNode getPrev() {
        return prev;
    }

    public void setPrev(OtoNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "OtoNode{" +
                "plaka='" + plaka + '\'' +
                ", giris='" + giris + '\'' +
                '}';
    }
}
