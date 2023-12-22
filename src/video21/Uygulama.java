package video21;

public class Uygulama {

    public static void main(String[] args) {


        StackYapisi stackYapisi = new StackYapisi(5);

        stackYapisi.push(1);
        stackYapisi.push(2);
        stackYapisi.push(3);
        stackYapisi.push(4);
        stackYapisi.push(5);

        System.out.println("Çıkan : " + stackYapisi.pop());
        System.out.println("Çıkan : " + stackYapisi.pop());
        System.out.println("Çıkan : " + stackYapisi.pop());

        stackYapisi.push(6);
        stackYapisi.push(7);
        stackYapisi.push(8);


    }

}
