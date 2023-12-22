package video30;

public class BTree {

    Node root;

    public BTree() {
        this.root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
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

    void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data + " -> ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " -> ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " -> ");
        }
    }

    //31.video içeriği ağaç yüksekliği ve eleman sayısı
    int height(Node root) {
        if(root == null) {
            return 0;
        } else {
            int sol = 0, sag = 0;
            sol = height(root.left);
            sag = height(root.right);

            if(sol > sag) {
                return sol+1;
            } else {
                return sag+1;
            }
        }
    }

    int size(Node root) {
        if(root == null) {
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }

    //32.video içeriği ağaçtan eleman silme
    Node delete(Node root, int data) {
        Node tmp1, tmp2;

        if(root == null) {
            return null;
        }
        if(root.data == data) {
            if(root.left == root.right) { //silinecek düğümün altında eleman yok (yaprak)
                root = null;
                return null;
            } else if(root.left == null) { //sol boş sağ dolu
                tmp1 = root.right;
                return tmp1;
            } else if(root.right == null) { //sağ boş sağ dolu
                tmp2 = root.left;
                return tmp2;
            } else {
                tmp1 = tmp2 = root.right;

                while (tmp1.left != null) {
                    tmp1 = tmp1.left;
                }
                tmp1.left = root.left;
                return tmp2;
            }
        } else {
            if(data < root.data) {
                root.left = delete(root.left, data);
            } else {
                root.right = delete(root.right, data);
            }
            return root;
        }
    }



}
