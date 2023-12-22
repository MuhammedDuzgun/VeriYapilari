package video30;

public class Uygulama {

    public static void main(String[] args) {

        BTree bTree = new BTree();

        bTree.root = bTree.insert(bTree.root, 10);
        bTree.root = bTree.insert(bTree.root, 8);
        bTree.root = bTree.insert(bTree.root, 15);
        bTree.root = bTree.insert(bTree.root, 5);
        bTree.root = bTree.insert(bTree.root, 12);
        bTree.root = bTree.insert(bTree.root, 20);
        bTree.root = bTree.insert(bTree.root, 9);


        System.out.println("kök : " + bTree.root.data);
        System.out.println("kök 'ün solu : " + bTree.root.left.data);

        System.out.print("preOrder :");
        bTree.preOrder(bTree.root);

        System.out.println("inOrder :");
        bTree.inOrder(bTree.root);

        System.out.println("postOrder");
        bTree.postOrder(bTree.root);

        System.out.println();
        System.out.println("Ağacın Yüksekliği : " +bTree.height(bTree.root));

        System.out.println();
        System.out.println("ağacın eleman sayısı : " +bTree.size(bTree.root));


    }

}
