public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int n, String m, double b) {
        root = insert_to_subtree(n, m, b, root);
    }

    public void remove(int n) {
        root = remove_from_subtree(n, root);
    }

    public boolean search(int n) {
        return search_subtree(root, n);
    }

    private BinaryNode insert_to_subtree(int n, String m, double b, BinaryNode t) {
        // your code goes here
        // create a new node with parameters n, m, b and insert the new node
        // return the modified subtree t

        BinaryNode newNode = new BinaryNode(n, m, b);

        if (t == null) {
            t = newNode;
        } else if (newNode.account_number < t.account_number) {
            t.left = insert_to_subtree(n, m, b, t.left);
        } else if (newNode.account_number > t.account_number) {
            t.right = insert_to_subtree(n, m, b, t.right);
        }

        return t;
    }

    public BinaryNode remove_from_subtree(int n, BinaryNode t) {
        // your code goes here
        // remove the node with account_number equals n from subtree t.
        // return the possibily-modified subtree t

        if (t == null) { // empty subtree. nothing to remove
            return t;
        } else if (n < t.account_number) {
            t.left = remove_from_subtree(n, t.left);
            return t;
        } else if (n > t.account_number) {
            t.right = remove_from_subtree(n, t.right);
            return t;
        } else {
            if (t.left != null && t.right != null) {
                t.account_number = findMin(t.right).account_number;
                t.right = remove_from_subtree(t.account_number, t.right);
                return t;
            } else if (t.left != null){
                return t.left;
            } else if (t.right != null){
                return t.right;
            } else {
                return null;
            }
        }
    }

    private BinaryNode findMin(BinaryNode t) {
        if (t == null)
            return null;
        else {
            if (t.left == null)
                return t;
            else
                return findMin(t.left);
        }
    }

    private boolean search_subtree(BinaryNode t, int n) {
        if (t == null)
            return false;
        else if (n < t.account_number)
            return search_subtree(t.left, n);
        else if (n > t.account_number)
            return search_subtree(t.right, n);
        else
            return true;
    }

    public void list_all_nodes() {
        list_subtree(root);
    }

    private void list_subtree(BinaryNode t) {
        // in-order
        if (t == null)
            return;
        list_subtree(t.left);
        System.out.println(t.account_number + " " + t.name + " " + t.balance);
        list_subtree(t.right);
    }

    public double sum_of_balances() {
        return sum_of_balances_subtree(root);
    }

    private double sum_of_balances_subtree(BinaryNode t) {
        if (t == null)
            return 0;
        else
            return t.balance + sum_of_balances_subtree(t.left) + sum_of_balances_subtree(t.right);
    }

    public int height() {
        return height_subtree(root);
    }

    private int height_subtree(BinaryNode t) {
        if (t == null)
            return -1;
        else {
            int h_left = height_subtree(t.left);
            int h_right = height_subtree(t.right);
            if (h_left > h_right)
                return 1 + h_left;
            else
                return 1 + h_right;
        }
    }

}
