package video27_PalindromKelime;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StackYapisi stackYapisi = new StackYapisi(100);
        KuyrukYapisi kuyrukYapisi = new KuyrukYapisi(100);

        System.out.println("Kelime Giriniz : ");
        String kelime = scanner.nextLine();

        int n = kelime.length();
        char[] harfler = kelime.toCharArray();

        int i=0;
        while (i < n) {
            stackYapisi.push(harfler[i]);
            kuyrukYapisi.enQueue(harfler[i]);
            i++;
        }

        boolean sonuc = true;
        while (!stackYapisi.isEmpty()) {
            if (kuyrukYapisi.deQueue() != stackYapisi.pop()) {
                sonuc = false;
                break;
            }
        }

        if (sonuc)
            System.out.println("Kelime Palindromdur");
        else
            System.out.println("Kelime Palindrom degildir");

    }

}
