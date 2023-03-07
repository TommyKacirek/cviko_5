package Tree;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
           
        }
        
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
    	preorderRec(root);
    }
    
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    void postorder() {
    	postorderRec(root);
    }
    
    void postorderRec(Node root) {
        if (root != null) {
        	postorderRec(root.left);
        	postorderRec(root.right);
        	System.out.print(root.key + " ");
        }
    }
    
    void printleaves() {
    	printleavesRec(root);
    }
    
    void printleavesRec(Node root) {
        if (root != null) {
        	if (root.left == null && root.right == null  ) {
        		System.out.print(root.key + " ");
        	}
        	printleavesRec(root.left);
        	printleavesRec(root.right);
        }
    }
    
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
        }

        return root;
    }

    Node search(int key) {
        return searchRec(root, key);
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (key < root.key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }
}
