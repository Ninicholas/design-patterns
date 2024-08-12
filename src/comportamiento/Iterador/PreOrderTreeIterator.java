package comportamiento.Iterador;

import java.util.Stack;

class PreOrderTreeIterator<T> implements Iterator<T> {
    private final Stack<TreeNode<T>> stack;

    public PreOrderTreeIterator(TreeNode<T> root) {
        stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }

        TreeNode<T> node = stack.pop();
        T result = node.data;

        if (node.right != null) {
            stack.push(node.right);
        }
        if (node.left != null) {
            stack.push(node.left);
        }

        return result;
    }
}
