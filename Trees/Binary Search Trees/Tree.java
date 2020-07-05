public class Tree {

    private TreeNode root;

    public void insertTreeNode(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }

        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public int getMin() {
        if (root != null) {
            return root.getMin();
        }

        return 0;
    }

    public int getMax() {
        if (root != null) {
            return root.getMax();
        }

        return 0;
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

}