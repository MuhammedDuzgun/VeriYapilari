package video9_OgrenciKayitUygulamasi;

import java.util.Scanner;

public class OgrListe {

    OgrNode head = null;
    OgrNode tail = null;


    void ekle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bilgisayar bölümüne kaydolmak isteyen ogrencinin bilgilerini giriniz");
        System.out.println("numara: "); int numara = scanner.nextInt(); scanner.nextLine();
        System.out.println("Ad: "); String ad = scanner.nextLine();
        System.out.println("Soyad: "); String soyad = scanner.nextLine();
        System.out.println("Vize: "); int vize = scanner.nextInt();
        System.out.println("Final: "); int fin = scanner.nextInt();


        OgrNode eleman = new OgrNode(numara, ad, soyad, vize, fin);


        if(head == null) {     //listenin boş olması durumu

            head = eleman;
            tail = eleman;
            System.out.println("Liste Oluşturuldu, ilk eleman eklendi");

        } else {  //Listenin boş olmaması durumu

            eleman.next = head;
            head = eleman;

            System.out.println(numara + " numaralı öğrenci listenin başına eklendi");

        }

    }

    void sil() {

        Scanner scanner = new Scanner(System.in);

        if(head == null) {

            System.out.println("Liste boş, Silinecek eleman yok !");

        } else {

            System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz : ");
            int numara = scanner.nextInt();

            if(numara == head.numara && head.next == null) {

                head = null;
                tail = null;

                System.out.println("Listede olan tek öğrenci de silinmiş oldu");

            } else if(numara == head.numara && head.next != null) {

                head = head.next;

                System.out.println(numara + " numaralı öğrenci silindi, listenin ilk elemanıydı");

            } else {

                OgrNode tmp = head;
                OgrNode tmp2 = head;

                while(tmp.next != null) {

                    if(numara == tmp.numara) {

                        tmp2.next = tmp.next;
                        System.out.println(numara + " numaralı öğrenci silindi");

                    }

                    tmp2 = tmp;
                    tmp = tmp.next;

                }

                if(numara == tmp.numara) { //burada silinmek istenen tail ise yapılması gerekenleri yaptık

                    tmp2.next = null;
                    tail = tmp2;

                    System.out.println(numara + " numaralı listenin son öğrencisi silindi");

                }


            }

        }

    }

    void yazdir() {

        if(head == null)  {

            System.out.println("Liste Boş");

        } else {

            OgrNode tmp = head;

            while(tmp.next != null) {

                System.out.println(tmp.numara + "Numaralı öğrencinin bilgileri: ");
                System.out.println(tmp);
                System.out.println("**********************************************");

                tmp = tmp.next;

            }

            System.out.println(tmp);

        }

    }

    void enBasariliOgrenciYazdir() {

        if(head == null) {

            System.out.println("Listede Boş !");

        } else {

            OgrNode tmp = head;

            OgrNode enBasarili = tmp;

            double enbOrtalama = enBasarili.ortalama;

            while(tmp.next != null) {

                if(tmp.ortalama > enBasarili.ortalama) {

                    enBasarili = tmp;

                }

                tmp = tmp.next;

            }

            System.out.println("En başarılı öğrencinin bilgileri: ");
            System.out.println(enBasarili);

        }

    }

}
