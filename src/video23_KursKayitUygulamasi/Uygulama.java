package video23_KursKayitUygulamasi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kursun kontejanını giriniz  : "); int kontejan = scanner.nextInt();
        KursStack kursStack = new KursStack(kontejan);

        int secim = -1;

        while (secim != 0) {

            System.out.println("Seçim yapınız : ");

            System.out.println("1- Ekle");
            System.out.println("2- Sil");
            System.out.println("3- Kursa kayıtlı öğrencileri listele");
            System.out.println("4- En son Kaydı getir");
            System.out.println("5- Kalan Kontejanı Göster");
            System.out.println("6- İlk Kaydolan Öğrenci");
            System.out.println("0- Çıkış");

            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    kursStack.push();
                    break;
                case 2:
                    kursStack.pop();
                    break;
                case 3:
                    kursStack.yazdir();
                    break;
                case 4:
                    kursStack.topGetir();
                    break;
                case 5:
                    kursStack.kalanKontejan();
                    break;
                case 6:
                    kursStack.ilkKayit();
                    break;
                case 0:
                    System.out.println("Program Sonlandırılıyor...");
                    break;
                default:
                    System.out.println("Hatalı secim yaptınız : [0-4]");
                    break;
            }


        }

    }

}
