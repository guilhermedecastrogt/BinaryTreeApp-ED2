class BinaryTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void preOrderLeft(Node node, StringBuilder output) {
        if (node != null) {
            output.append(node.value).append(",");
            preOrderLeft(node.left, output);
            preOrderLeft(node.right, output);
        }
    }

    public void inOrderLeft(Node node, StringBuilder output) {
        if (node != null) {
            inOrderLeft(node.left, output);
            output.append(node.value).append(",");
            inOrderLeft(node.right, output);
        }
    }

    public void postOrderLeft(Node node, StringBuilder output) {
        if (node != null) {
            postOrderLeft(node.left, output);
            postOrderLeft(node.right, output);
            output.append(node.value).append(",");
        }
    }

    public void preOrderRight(Node node, StringBuilder output) {
        if (node != null) {
            output.append(node.value).append(",");
            preOrderRight(node.right, output);
            preOrderRight(node.left, output);
        }
    }

    public void inOrderRight(Node node, StringBuilder output) {
        if (node != null) {
            inOrderRight(node.right, output);
            output.append(node.value).append(",");
            inOrderRight(node.left, output);
        }
    }

    public void postOrderRight(Node node, StringBuilder output) {
        if (node != null) {
            postOrderRight(node.right, output);
            postOrderRight(node.left, output);
            output.append(node.value).append(",");
        }
    }

    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
