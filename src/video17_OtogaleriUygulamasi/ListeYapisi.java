package video17_OtogaleriUygulamasi;

import java.util.Scanner;

public class ListeYapisi {

    OtoNode head = null;
    OtoNode tail = null;

    void ekle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz oto bilgilerini giriniz : ");
        System.out.println("id: "); int id = scanner.nextInt();                                      scanner.nextLine();
        System.out.println("Plaka : "); String plaka = scanner.nextLine();
        System.out.println("Marka : "); String marka = scanner.nextLine();
        System.out.println("Model : "); String model = scanner.nextLine();
        System.out.println("Renk : "); String renk = scanner.nextLine();
        System.out.println("Alış Fiyatı : "); int alisFiyat = scanner.nextInt();                     scanner.nextLine();
        System.out.println("Aciklama : "); String aciklama = scanner.nextLine();

        OtoNode eleman = new OtoNode(id, plaka, marka, model, renk, alisFiyat, aciklama);

        if(head == null) {

            head = eleman;
            tail = eleman;
            tail.next = head;

            System.out.println("Listenin ilk elemanı eklendi");

        } else if(head != null && head.next == null) {

           eleman.next = head;
           head = eleman;
           tail.next = head;

            System.out.println("Listenin ikinci elemanı eklendi");

        } else {

            eleman.next = head;
            head = eleman;
            tail.next = head;

            System.out.println(plaka + " plakalı araç otogaleriye eklenmiş oldu");

        }



    }

    void sil() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz oto id giriniz : "); int id = scanner.nextInt();

        if(head == null) {

            System.out.println("Listede eleman bulunmuyor");

        } else if(head != null && head.next == null) { //listede tek eleman olması durumu

            head = null;
            tail = null;

            System.out.println("Listede bulunan son eleman silindi");

        } else {

            OtoNode tmp = head;
            OtoNode tmp2 = head;

            int i = 1;

            while(tmp != tail) {

                i++;
                tmp = tmp.next;

            }

            tmp2 = head;
            tmp = head;

            int n = 1;

            while(tmp.id != id) {

                n++;
                tmp2 = tmp;
                tmp = tmp.next;

            }

            if(n == i) { //sondaki elemanı silme durumu

                tmp2.next = tmp.next;
                tail = tmp2;

            } else { //aradan silme

                tmp2.next = tmp.next;

            }

        }




    } //burda bazı hatalar var

    void yazdir() {

        if(head == null) {

            System.out.println("Liste yapısı boş");

        } else {

            OtoNode tmp = head;

            while(tmp != tail) {

                System.out.println(tmp);
                tmp = tmp.next;

            }

            System.out.println(tmp);

        }



    }

    void aracAra() {

        Scanner scanner = new Scanner(System.in);

        if(head == null) {

            System.out.println("Oto galeride araç bulunmamaktadır");

        } else {

            System.out.println("Aradığınız aracın id bilgisini giriniz : "); int id = scanner.nextInt();

            OtoNode tmp = head;

            while(tmp.id != id) {

                tmp = tmp.next;

            }

            System.out.println("Aradığınız araca ait bilgiler : ");
            System.out.println(tmp);

        }



    }



}
