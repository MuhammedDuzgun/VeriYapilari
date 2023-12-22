package video14_MusteriKayitUygulamasi;

public class MusteriNode {

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    MusteriNode next;
    MusteriNode prev;

    public MusteriNode(int id, String ad, String soyad, String tel, String adres, String urun) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.urun = urun;
        next = null;
        prev = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public MusteriNode getNext() {
        return next;
    }

    public void setNext(MusteriNode next) {
        this.next = next;
    }

    public MusteriNode getPrev() {
        return prev;
    }

    public void setPrev(MusteriNode prev) {
        this.prev = prev;
    }


    @Override
    public String toString() {
        return "MusteriNode{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tel='" + tel + '\'' +
                ", adres='" + adres + '\'' +
                ", urun='" + urun + '\'' +
                '}';
    }
}
