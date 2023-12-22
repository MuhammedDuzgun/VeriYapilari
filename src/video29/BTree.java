package video29;

public class BTree {

    Node root;

    public BTree() {
        this.root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        System.out.println(data + " Ağaca Eklendi");
        return root;
    }

    Node insert(Node root, int data) {
        if(root != null) {
            if(data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }
}
