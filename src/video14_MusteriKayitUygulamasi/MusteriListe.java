package video14_MusteriKayitUygulamasi;

import video9_OgrenciKayitUygulamasi.OgrNode;

import java.util.Scanner;

public class MusteriListe {

    MusteriNode head = null;
    MusteriNode tail = null;

    void ekle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz müsterinin bilgilerini giriniz: ");
        System.out.println("numarasi: "); int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad: "); String ad = scanner.nextLine();
        System.out.println("Soyad: "); String soyad = scanner.nextLine();
        System.out.println("Telefon: "); String telefon = scanner.nextLine();
        System.out.println("Adres: "); String adres = scanner.nextLine();
        System.out.println("Ürün: "); String urun = scanner.nextLine();

        MusteriNode eleman = new MusteriNode(id, ad, soyad, telefon, adres, urun);

        if(head == null) {

            head = eleman;
            tail = eleman;

            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
        } else {

            eleman.next = head;
            head.prev = eleman;
            head = eleman;

            System.out.println(id + " numaralı müsteri listenin basına eklendi");
        }

    }

    void sil() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Silinecek musterinin numarasını giriniz: ");
        int id = scanner.nextInt();

        if(head == null) {

            System.out.println("Liste Yapısı boş ");

        } else {

            if(head.next == null && head.id == id) {

                head = null;
                tail = null;

                System.out.println("Listenin tek elemanı silindi");

            } else if(head.next != null && head.id == id) {

                head = head.next;
                head.prev = null;

                System.out.println("Listenin basindaki eleman silindi");
            } else if(tail.id == id) {

                tail = tail.prev;
                tail.next = null;

                System.out.println("Listenin sonundaki eleman silindi");
            } else {
                //Bu kısmı videodan farklı yaptım.
                MusteriNode tmp = head;

                while(tmp.id != id) {

                    tmp = tmp.next;

                }

                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;

                System.out.println(id + " Numaralı müsteri silindi");
            }

        }

    }

    void guncelle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Güncellemek istediğiniz musterinin numarasını giriniz : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Güncel ürünün adını giriniz : ");
        String urun = scanner.nextLine();

        MusteriNode tmp = head;

        while (tmp.id != id) {

            tmp = tmp.next;

        }

        tmp.urun = urun;

        System.out.println(id + "Numaralı müsterinin ürünü güncellendi");

    }

    void musteriAra() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen aradığınız müsterinin numarasını giriniz: ");
        int id = scanner.nextInt();

        MusteriNode tmp = head;

        while(tmp.id != id) {

            tmp = tmp.next;

        }

        System.out.println("Aranılan müsterinin bilgileri: ");
        System.out.println(tmp);

    }

    void listele() {

        if(head == null) {

            System.out.println("Liste yapısı boş");

        } else {

            MusteriNode tmp = head;

            while(tmp != null) {

                System.out.println(tmp);
                tmp = tmp.next;

            }

        }

    }

}
