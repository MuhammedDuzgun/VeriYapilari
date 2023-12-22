package video39_InsertionSort;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {


        //insertion sort (eklemeli sıralama algoritması)
        // 7 3 5 1 2 ilk hal
        // (7 3) 5 1 2 -> (3 7) 5 1 2 :1.döngü
        // (7 3 5) 1 2 -> (3 5 7) 1 2 :2.döngü
        // (7 3 5 1) 2 -> (1 3 5 7) 2 :3.döngü
        // (7 3 5 1 2) -> (1 2 3 5 7) :4.döngü

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diznin boyutunu giriniz  :"); int n = scanner.nextInt();
        int[] dizi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("dizinin " + i  + ". elemanını giriniz :") ;
            dizi[i] = scanner.nextInt();
        }

        inserSort(dizi, n);

        System.out.println("dizinin sıralanmış hali : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " - ");
        }

    }

    private static void inserSort(int[] dizi, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 ; j--) {
                if (dizi[j] < dizi[j-1]) {
                    int tmp = dizi[j];
                    dizi[j] = dizi[j-1];
                    dizi[j-1] = tmp;
                }
            }
        }

    }


}
