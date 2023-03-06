package Tree;

public class Node {
    public int key;     // hodnota uzlu
    public Node left;   // levý podstrom
    public Node right;  // pravý podstrom

    public Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}