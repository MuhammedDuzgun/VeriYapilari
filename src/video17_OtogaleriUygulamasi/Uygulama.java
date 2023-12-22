package video17_OtogaleriUygulamasi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        ListeYapisi listeYapisi = new ListeYapisi();

        Scanner scanner = new Scanner(System.in);

        int secim = -1;

        while (secim != 0) {

            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("1- ekle");
            System.out.println("2- sil");
            System.out.println("3- listele");
            System.out.println("4- Araç ara");
            System.out.println("0- çıkış");

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
                case  4:
                    listeYapisi.aracAra();
                    break;
                case 0:
                    System.out.println("Uygulama Sonlandırılıyor...");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız : [0 - 4]");
                    break;
            }

        }



    }

}
