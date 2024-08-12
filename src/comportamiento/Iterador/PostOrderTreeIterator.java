package comportamiento.Iterador;

import java.util.Stack;

class PostOrderTreeIterator<T> implements Iterator<T> {
    private final Stack<TreeNode<T>> outStack;

    public PostOrderTreeIterator(TreeNode<T> root) {
        Stack<TreeNode<T>> stack = new Stack<>();
        outStack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode<T> node = stack.pop();
            outStack.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !outStack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return outStack.pop().data;
    }
}
