package video23_KursKayitUygulamasi;

import java.util.Scanner;

public class KursStack {

    KursNode top;
    int kontejan;
    int sayac;

    public KursStack(int kontejan) {
        this.kontejan = kontejan;
        sayac = 0;
        top = null;
    }

    void push() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kursa kaydedilecek öğrenci bilgileri : ");
        System.out.println("tc: "); String tc = scanner.nextLine();
        System.out.println("ad: "); String ad = scanner.nextLine();
        System.out.println("soyad: "); String soyad = scanner.nextLine();
        System.out.println("bölüm: "); String bolum = scanner.nextLine();

        KursNode eleman = new KursNode(tc,ad,soyad,bolum);

        if(isFull()) {

            System.out.println("Kurs Kontejanı Dolu");

        } else {

            if(isEmpty()) {

                top = eleman;
                System.out.println(top.tc + " nolu öğrenci kursa ilk kayıt olarak eklenmiştir.");

            } else {

                eleman.next = top;
                top = eleman;

                System.out.println(top.tc + " nolu öğrenci kursa eklendi");

            }

            sayac++;

        }


    }

    void pop() {

        if(isEmpty()) {

            System.out.println("Stack Yapısı Boş");

        } else {

            System.out.println(top.tc + " nolu öğrenci silindi.");
            top = top.next;

            sayac--;

        }


    }

    void yazdir() {

        KursNode tmp = top;

        if(isEmpty()) {
            System.out.println("Kursta Kayıtlı öğrenci bulunmamaktadır.");
        } else {

            while(tmp.next != null) {

                System.out.println(tmp);
                tmp = tmp.next;

            }

            System.out.println(tmp);

        }

    }

    void topGetir() {

        if(isEmpty()) {
            System.out.println("Kursta Kayıtlı öğrenci bulunmamaktadır.");
        } else {
            System.out.println(top);
        }

    }

    void kalanKontejan() {
        System.out.println("Kalan Kontejan Sayısı : " + (kontejan - sayac) );
    }

    void ilkKayit() {

        KursNode tmp = top;

        while(tmp.next != null) {
            tmp = tmp.next;
        }

        System.out.println("İlk kayıtlı öğrenci : " +tmp);

    }

    boolean isFull() {
        return sayac == kontejan;
    }

    boolean isEmpty() {
        return  sayac == 0;
    }


}
