package video14_MusteriKayitUygulamasi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim = -1;

        MusteriListe musteriListe = new MusteriListe();

        while(secim != 0) {

            System.out.println("İşlem seçininiz: ");
            System.out.println("1- Ekle");
            System.out.println("2- Sil");
            System.out.println("3- Güncelle");
            System.out.println("4- Musteri Ara");
            System.out.println("5- Listele");
            System.out.println("0- Çıkış");

            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    musteriListe.ekle();
                    break;
                case 2:
                    musteriListe.sil();
                    break;
                case 3:
                    musteriListe.guncelle();
                    break;
                case 4:
                    musteriListe.musteriAra();
                    break;
                case 5:
                    musteriListe.listele();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı Seçim yaptınız. [0-5]");
                    break;
            }

        }



    }

}
