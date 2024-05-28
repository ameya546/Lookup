package mappings;

class Node {
    String key;
    String data;
    Node next;

    public Node(String key, String data, Node next) {
        this.key = key;
        this.data = data;
        this.next = next;
    }
}