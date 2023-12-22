package video33_OgrenciKayitUygulamasi_AgacYapisi;

public class BTree {

    OgrNode root;

    public BTree() {
        root = null;
    }

    OgrNode newNode(int no, int not, String ad) {
        root = new OgrNode(no, not, ad);
        return root;
    }

    OgrNode insert(OgrNode root, int no, int not, String ad) {
        if(root != null) {
            if(no < root.no) {
                root.left = insert(root.left, no ,not, ad);
            } else {
                root.right = insert(root.right, no, not, ad);
            }
        } else {
            root = newNode(no, not, ad);
        }
        return root;
    }

    void preOrder(OgrNode root) {
        if(root != null) {
            System.out.print(root.no + "\t" + root.not + "\t" +root.ad + " -> ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    void inOrder(OgrNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.no + "\t" + root.not + "\t" + root.ad + " -> ");
            inOrder(root.right);
        }
    }

    void postOrder(OgrNode root) {
        if(root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.no + "\t" +root.not + "\t" + root.ad + " -> ");
        }
    }

    OgrNode delete(OgrNode root, int no) {
        OgrNode tmp1;
        OgrNode tmp2;

        if(root == null) {
            return null;
        }
        if(root.no == no) {
            if(root.right == root.left) { //yaprak düğüm kontrolü
                root = null;
                return root;
            } else if(root.left == null) {
                tmp1 = root.right;
                return tmp1;
            } else if(root.right == null) {
                tmp1 = tmp2 = root.right;

                while (tmp1.left != null) {
                    tmp1 = tmp1.left;
                    tmp1.left = root.left;
                    return tmp2;
                }

            }
        } else {
            if(no < root.no) {
                root.left = delete(root.left, no);
            } else {
                root.right = delete(root.right, no);
            }
        }
        return root;
    }


}
