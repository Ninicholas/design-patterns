package comportamiento.Iterador;

class TreeCollection<T> implements IterableCollection<T> {
    private TreeNode<T> root;

    public TreeCollection() {
        this.root = null;
    }

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private TreeNode<T> addRecursive(TreeNode<T> current, T data) {
        if (current == null) {
            return new TreeNode<>(data);
        }

        if (((Comparable<T>) data).compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);
        } else if (((Comparable<T>) data).compareTo(current.data) > 0) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    @Override
    public Iterator<T> createIterator(String orderType) {
        return switch (orderType.toLowerCase()) {
            case "preorder" -> new PreOrderTreeIterator<>(root);
            case "inorder" -> new InOrderTreeIterator<>(root);
            case "postorder" -> new PostOrderTreeIterator<>(root);
            default -> throw new IllegalArgumentException("Tipo de orden no soportado: " + orderType);
        };
    }
}

