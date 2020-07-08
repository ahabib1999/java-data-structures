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

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private TreeNode deleteNode(TreeNode subTreeNode, int value) {

        if (subTreeNode == null) {
            return subTreeNode;
        }

        if (subTreeNode.getData() > value) {
            subTreeNode.setLeftChild(deleteNode(subTreeNode.getLeftChild(), value));
        }

        else if (subTreeNode.getData() < value) {
            subTreeNode.setRightChild(deleteNode(subTreeNode.getRightChild(), value));
        }

        else {
            if (subTreeNode.getLeftChild() == null) {
                return subTreeNode.getRightChild();
            }

            else if (subTreeNode.getRightChild() == null) {
                return subTreeNode.getLeftChild();
            }

            subTreeNode.setData(subTreeNode.getRightChild().getMin());

            int currentNodeData = subTreeNode.getData();
            TreeNode currentNodeRightChild = subTreeNode.getRightChild();
            TreeNode replacingNode = deleteNode(currentNodeRightChild, currentNodeData);

            subTreeNode.setRightChild(replacingNode);
        }

        return subTreeNode;
    }

}