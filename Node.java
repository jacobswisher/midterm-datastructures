public class Node {
    public int key;
    public int value;
    public Node next;
    public Node(int number, int v, Node n) {
        next = n;
	value = v;
        key = number;
    }
}
