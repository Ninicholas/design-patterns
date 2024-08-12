package comportamiento.Iterador;

public class testIterador {
    public static void main(String[] args) {
        TreeCollection<Integer> tree = new TreeCollection<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        Iterator<Integer> inorderIterator = tree.createIterator("inorder");
        System.out.println("In-Order:");
        while (inorderIterator.hasNext()) {
            System.out.println(inorderIterator.next());
        }

        Iterator<Integer> preorderIterator = tree.createIterator("preorder");
        System.out.println("Pre-Order:");
        while (preorderIterator.hasNext()) {
            System.out.println(preorderIterator.next());
        }

        Iterator<Integer> postorderIterator = tree.createIterator("postorder");
        System.out.println("Post-Order:");
        while (postorderIterator.hasNext()) {
            System.out.println(postorderIterator.next());
        }
    }
}
