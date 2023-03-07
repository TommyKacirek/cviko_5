package Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Vložení prvků do stromu
        tree.insert(7);
        
        tree.insert(7);
        
        
        tree.insert(5);
        
        
        tree.insert(14);
        
        
        tree.insert(1);
        
        
        tree.insert(6);
       
        
        tree.insert(16);
       
        
        tree.insert(10);
        
        
        
        // Vypsání prvky ve stromu pomocí inorder průchodu
        System.out.println("Inorder traversal: ");
        tree.inorder();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Preorder traversal: ");
        tree.preorder();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Postorder traversal: ");
        tree.postorder();
        
        
        System.out.println("");
        System.out.println("Leaves print is");
        tree.printleaves();
        
        System.out.println("");
       

        // Smazání uzlu a vypsání prvky pomocí inorder průchodu
        System.out.println("\nDelete node 10");
        tree.delete(10);
        System.out.println("");
        System.out.print("Inorder traversal after deleting node 10: ");
        tree.inorder();
        
        System.out.println("");
        
        // Vyhledání uzlu ve stromu
        System.out.println("\nSearch node 6: " + tree.search(1));
        
        System.out.println("");
        
        System.out.println("Search node 10: " + tree.search(10));
            
    }
}
