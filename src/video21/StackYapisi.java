package video21;

import java.util.Scanner;

public class StackYapisi {

    int dizi[];
    int size;
    int indis;

    public StackYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }

    void push(int data) {

        if(isFull()) {

            System.out.println("Stack Yapısı dolu");

        } else {

            indis++;
            dizi[indis] = data;

            System.out.println("Eklendi : " +data);

        }

    }

    int pop() {

        if(isEmpty()) {

            System.out.println("Stack yapısı boş !");

            return -1;

        } else {

            return dizi[indis--];

        }

    }

    boolean isFull() {

        return (indis == size - 1);

    }

    boolean isEmpty() {

        return (indis == -1);

    }

}
