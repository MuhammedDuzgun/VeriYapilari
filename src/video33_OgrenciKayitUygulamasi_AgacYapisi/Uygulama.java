package video33_OgrenciKayitUygulamasi_AgacYapisi;

public class Uygulama {

    public static void main(String[] args) {

        BTree bTree = new BTree();

        bTree.root = bTree.insert(bTree.root, 1, 56, "Muhammed");
        bTree.root = bTree.insert(bTree.root, 2, 16, "Mehmet");
        bTree.root = bTree.insert(bTree.root, 3, 36, "Furkan");
        bTree.root = bTree.insert(bTree.root, 4, 46, "Mustafa");


        bTree.inOrder(bTree.root);

        bTree.root = bTree.delete(bTree.root, 4);

        System.out.println("Silme işleninden sonra : ");

        bTree.inOrder(bTree.root);




    }

}
