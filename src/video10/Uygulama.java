package video10;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim = -1;

        ListeYapisi listeYapisi = new ListeYapisi();

        while(secim != 0) {

            System.out.println();
            System.out.println("Seçim yapınız");
            System.out.println("1- Başa Ekle");
            System.out.println("2- Sona Ekle");
            System.out.println("3- Listele");
            System.out.println("4- Araya Ekle");
            System.out.println("5- Sondan Yazdır");
            System.out.println("6- Baştan Sil");
            System.out.println("7- Sondan Sil");
            System.out.println("8- Aradan Sil");


            System.out.println("0- Sonlandır");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Başa eklemek istediğiniz düğümün datasını giriniz: ");
                    int data = scanner.nextInt();
                    listeYapisi.basaEkle(data);
                    break;
                case 2:
                    System.out.println("Sona eklemek istediğiniz düğümün datasını giriniz: ");
                    int data2 = scanner.nextInt();
                    listeYapisi.sonaEkle(data2);
                    break;
                case 3:
                    listeYapisi.yazdir();
                    break;
                case 4:
                    System.out.println("Araya eklemek istediğiniz düğümün indisini giriniz: ");
                    int indis = scanner.nextInt();
                    System.out.println("Araya Eklemek istetediğiniz düğümün datasını giriniz: ");
                    int data3 = scanner.nextInt();
                    listeYapisi.arayaEkle(indis, data3);
                    break;
                case 5:
                    listeYapisi.sondanYazdir();
                    break;
                case 6:
                    listeYapisi.bastanSil();
                    break;
                case 7:
                    listeYapisi.sondanSil();
                    break;
                case 8:
                    System.out.println("Lütfen Aradan Silmek istediğiniz düğümün indisini giriniz: ");
                    int indis2 = scanner.nextInt();
                    listeYapisi.aradanSil(indis2);
                    break;
                case 0:
                    System.out.println("Programı Sonlandırdınız.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız. [0-7]");
                    break;

            }

        }



    }

}
