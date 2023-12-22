package video9_OgrenciKayitUygulamasi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OgrListe ogrListe  = new OgrListe();

        int secim = -1;

        while (secim != 0) {

            System.out.println();
            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması");
            System.out.println("1- Yeni kayıt");
            System.out.println("2- Kayıt Sil");
            System.out.println("3- Kayıtları Listele");
            System.out.println("4- En başarılı öğrenciyi listele");
            System.out.println("0- çıkış");

            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    ogrListe.ekle();
                    break;
                case 2:
                    ogrListe.sil();
                    break;
                case 3:
                    ogrListe.yazdir();
                    break;
                case 4:
                    ogrListe.enBasariliOgrenciYazdir();
                    break;
                case 0:
                    System.out.println("Programı Sonlandırdınız");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız : [0-4]");
                    break;

            }

        }



    }

}
