package video20_OtoparkKayitUygulamasi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListeYapisi listeYapisi = new ListeYapisi();

        int secim = -1;

        while(secim != 0) {

            System.out.println("Yapmak istediğniz işlemi seçiniz : ");
            System.out.println("1- ekle");
            System.out.println("2- Sil");
            System.out.println("3- Listele");
            System.out.println("0- Çıkış");

            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    listeYapisi.ekle();
                    break;
                case 2:
                    listeYapisi.sil();
                    break;
                case 3:
                    listeYapisi.yazdir();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız :  [0-4]");
                    break;
            }

        }


    }

}
