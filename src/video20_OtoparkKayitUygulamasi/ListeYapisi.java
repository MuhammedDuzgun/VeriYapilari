package video20_OtoparkKayitUygulamasi;

import java.util.Scanner;

public class ListeYapisi { //cift yonlu dairesel bagli liste yapisi

    OtoNode head = null;
    OtoNode tail = null;

    void ekle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklemek isteiğiniz arabanın bilgilerini giriniz : ");
        System.out.println("plaka : "); String plaka = scanner.nextLine();
        System.out.println("giriş saati : "); String giris = scanner.nextLine();

        OtoNode eleman = new OtoNode(plaka, giris);

        if(head == null) {

            head = eleman;
            tail = eleman;

            head.prev = tail;
            head.next = tail;
            tail.next = head;
            tail.prev = head;

            System.out.println("İlk eleman eklendi");

        } else {

           eleman.next = head;
           head.prev = eleman;
           head = eleman;
           tail.next = head;
           head.prev = tail;


        }

    }

    void sil() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Silmek istediğiniz aracın plakasını giriniz : ");
        String plaka = scanner.nextLine();

        if(head == null) {

            System.out.println("Otoparkta araç bulunmamaktadır");

        } else if(head == tail && head.plaka.equals(plaka)) {

            head = null;
            tail = null;

            System.out.println("Listenin tek elemanı silindi");

        } else if (head != tail && head.plaka.equals(plaka)) { //bastan silme durumu

            head = head.next;
            head.prev = tail;
            tail.next = head;

        } else {

            OtoNode tmp = head;
            int i = 1;

            while(tmp != tail) {

                i++;
                tmp = tmp.next;

            }

            if(tmp.plaka.equals(plaka)) { //sondan silme durumu

                tail = tail.prev;
                head.prev = tail;
                tail.next = head;

            } else {

                tmp = head;

                while(!tmp.plaka.equals(plaka)) {

                    tmp = tmp.next;

                }

                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;

            }

        }



        }

    void yazdir() {

        OtoNode tmp = head;

        while(tmp != tail) {

            System.out.println(tmp);

            tmp = tmp.next;

        }

        System.out.println(tmp);

    }




    }


