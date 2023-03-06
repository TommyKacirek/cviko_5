package Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Vložení prvků do stromu
        tree.insert(1);
        tree.insert(2);
        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);

        // Vypsání prvky ve stromu pomocí inorder průchodu
        System.out.print("Inorder traversal: ");
        tree.inorder();

        // Smazání uzlu a vypsání prvky pomocí inorder průchodu
        System.out.println("\nDelete node 10");
        tree.delete(10);
        System.out.print("Inorder traversal after deleting node 10: ");
        tree.inorder();

        // Vyhledání uzlu ve stromu
        System.out.println("\nSearch node 6: " + tree.search(1));
        System.out.println("Search node 10: " + tree.search(10));
    }
}
