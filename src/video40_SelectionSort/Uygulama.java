package video40_SelectionSort;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        //7 3 5 1 2 ilk hal
        //(7) 3 5 (1) 2  -> (1) 3 5 (7)          - 1.döngü
        //1 (3) 5 7 (2)  -> 1 (2) 5 7 (3)        - 2.döngü
        //1 2 (5) 7 (3)  -> 1 2 (3) 7 (5)        - 3.döngü
        //1 2 3 (7) (5)   -> 1 2 3 (5) (7)       - 4.döngü (küçükten büyüğe sıralanmış oldu)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin size değerni giriniz : "); int n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("dizinin " + i + ". elemanını giriniz :");
            dizi[i] = scanner.nextInt();
        }


        selectionSort(dizi, n);
        System.out.println("Selection Sort İşlemi : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " - ");
        }

    }

    private static void selectionSort(int[] dizi, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (dizi[min] > dizi[j]) {
                    min = j;
                }
            }
            int tmp = dizi[min];
            dizi[min] = dizi[i];
            dizi[i] = tmp;
        }
    }


}
