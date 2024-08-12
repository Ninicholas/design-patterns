package comportamiento.Iterador;

import java.util.Stack;

class InOrderTreeIterator<T> implements Iterator<T> {
    private final Stack<TreeNode<T>> stack;

    public InOrderTreeIterator(TreeNode<T> root) {
        stack = new Stack<>();
        pushLeft(root);
    }

    private void pushLeft(TreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
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
        pushLeft(node.right);

        return result;
    }
}

