package video15;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int secim = -1;

        ListeYapisi listeYapisi = new ListeYapisi();

        while(secim != 0) {

            System.out.println();
            System.out.println("Seçim Yapınız : ");
            System.out.println("1- Basa Ekle");
            System.out.println("2- Sona Ekle");
            System.out.println("3- Araya Ekle");
            System.out.println("4- Yazdır");
            System.out.println("5- Bastan Sil");
            System.out.println("6- Sondan Sil");
            System.out.println("7- Aradan Sil");
            System.out.println("0- Çıkış");
            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    listeYapisi.basaEkle();
                    break;
                case 2:
                    listeYapisi.sonaEkle();
                    break;
                case 3:
                    listeYapisi.arayaEkle();
                    break;
                case 4:
                    listeYapisi.yazdir();
                    break;
                case 5:
                    listeYapisi.bastanSil();
                    break;
                case 6:
                    listeYapisi.sondanSil();
                    break;
                case 7:
                    listeYapisi.aradanSil();
                    break;
                case 0:
                    System.out.println("Çıkış yaptınız");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız : [0-4]");
                    break;
            }

        }



    }

}
