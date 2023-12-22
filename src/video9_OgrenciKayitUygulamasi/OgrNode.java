package video9_OgrenciKayitUygulamasi;

public class OgrNode {

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;

    OgrNode next;

    public OgrNode(int numara, String ad, String soyad, int vize, int fin) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;

        ortalama = vize * 0.4 + fin * 0.6;

        if(ortalama >= 50) {
            durum = "Geçti";
        } else {
            durum = "Kaldı";
        }

        next = null;

    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public OgrNode getNext() {
        return next;
    }

    public void setNext(OgrNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "OgrNode{" +
                "numara=" + numara +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", vize=" + vize +
                ", fin=" + fin +
                ", ortalama=" + ortalama +
                ", durum='" + durum + '\'' +
                '}';
    }
}
