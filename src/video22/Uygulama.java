package video22;

import video22.StackYapisi;

public class Uygulama {

    public static void main(String[] args) {

        StackYapisi stackYapisi = new StackYapisi(5);

        stackYapisi.push(1);
        stackYapisi.push(2);
        stackYapisi.push(3);
        stackYapisi.push(4);
        stackYapisi.push(5);

        stackYapisi.printStack();

        stackYapisi.pop();

        stackYapisi.printStack();

        stackYapisi.getTop();

        stackYapisi.pop();

        stackYapisi.getTop();

    }

}
