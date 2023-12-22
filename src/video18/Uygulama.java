package video18;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListeYapisi listeYapisi = new ListeYapisi();

        int secim = -1;

        while(secim != 0) {

            System.out.println();
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("1- Basa ekle");
            System.out.println("2- Sona ekle");
            System.out.println("3- Araya ekle");
            System.out.println("4- Baştan Yazdır");
            System.out.println("5- Sondan Yazdır");
            System.out.println("6- Bastan Sil");
            System.out.println("7- Sondan Sil");
            System.out.println("8- Aradan Sil");
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
                    listeYapisi.terstenYazdir();
                    break;
                case 6:
                    listeYapisi.bastanSil();
                    break;
                case 7:
                    listeYapisi.sondanSil();
                    break;
                case 8:
                    listeYapisi.aradanSil();
                    break;
                case 0:
                    System.out.println("Program Sonlandırılıyor...");
                    break;
                default:
                    System.out.println("Hatalı secim yaptınız : [0-5]");
                    break;
            }

        }



    }

}
