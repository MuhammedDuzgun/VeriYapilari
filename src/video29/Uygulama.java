package video29;

public class Uygulama {

    public static void main(String[] args) {

        BTree bTree = new BTree();

        bTree.root = bTree.insert(bTree.root, 10);
        bTree.root = bTree.insert(bTree.root, 15);
        bTree.root = bTree.insert(bTree.root, 8);
        bTree.root = bTree.insert(bTree.root, 20);
        bTree.root = bTree.insert(bTree.root, 4);
        bTree.root = bTree.insert(bTree.root, 12);

        System.out.println(" ---------------------------------------------------------- ");

        System.out.println("Kökün Datası: " + bTree.root.data);
        System.out.println("Kökün Sağının Datası: " + bTree.root.right.data);
        System.out.println("Kökün Solunun Datası: " + bTree.root.left.data);


    }

}
