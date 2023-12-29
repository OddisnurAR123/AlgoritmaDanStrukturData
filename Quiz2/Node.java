package Quiz2;

public class Node {
    String data;
    Node next, prev;

    public Node(Node prev, String data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}