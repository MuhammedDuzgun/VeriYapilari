package video38_BubbleSort;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        //Bubble Sort - en büyük değeri bulup en sona taşıyoruz. (küçükten büyüğe sıralama)

        // 7 5 3 1 2  sıralamın ilk durumu
        // 5 3 1 2 7  i=0 iken sıralama (en büyük olan en sona geldi)
        // 3 1 2 5 7  i=1 iken sıralama
        // 3 1 2 5 7  i=2 iken sıralama
        // 1 2 3 5 7  i=3 iken sıralama
        // 1 2 3 5 7  i=4 iken sıralama (son durum)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dizinin uzunluğunu giriniz : " ); int n = scanner.nextInt();
        int[] dizi = new int[n];

        System.out.println();
        System.out.println("dizinin elemanlarını doldurunuz :");
        for (int i = 0; i < n; i++) {
            System.out.println(i + ". eleman : "); dizi[i] = scanner.nextInt();
        }

        bobbleSort(dizi, n);
        System.out.println("dizinin bobble sort ile sıralanmış hali : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " - ");
        }


    }

    private static void bobbleSort(int[] dizi, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(dizi[j] > dizi[j+1]) {
                    int gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                }
            }
        }
    }


}
