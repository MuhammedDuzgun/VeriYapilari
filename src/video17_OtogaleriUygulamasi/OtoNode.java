package video17_OtogaleriUygulamasi;

public class OtoNode {

    int id;
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    double satisFiyat;
    String aciklama;
    OtoNode next;

    public OtoNode(int id, String plaka, String marka, String model, String renk, int alisFiyat, String aciklama) {
        this.id = id;
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.alisFiyat = alisFiyat;
        this.aciklama = aciklama;
        satisFiyat = alisFiyat + alisFiyat * 0.2;
        next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAlisFiyat() {
        return alisFiyat;
    }

    public void setAlisFiyat(int alisFiyat) {
        this.alisFiyat = alisFiyat;
    }

    public double getSatisFiyat() {
        return satisFiyat;
    }

    public void setSatisFiyat(double satisFiyat) {
        this.satisFiyat = satisFiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public OtoNode getNext() {
        return next;
    }

    public void setNext(OtoNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "OtoNode{" +
                "id=" + id +
                ", plaka='" + plaka + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", alisFiyat=" + alisFiyat +
                ", satisFiyat=" + satisFiyat +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
