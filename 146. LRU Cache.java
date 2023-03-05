class LRUCache {

    private final Node head = new Node();
    private final Node tail = new Node();
    private Map<Integer, Node> cache = new HashMap<>();
    private int capacity;

    class Node {
        int value;
        int key;
        Node next;
        Node prev;
    }

    public void addNode(Node node) {
        Node temp = head.next; 
        temp.prev = node; 
        head.next = node; 
        node.prev = head; 
        node.next = temp; 
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        int result = -1;
        Node node = cache.get(key);
        if (node != null) {
            removeNode(node);
            addNode(node);
            result = node.value;   
        }
        return result;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node != null) {
            removeNode(node);
            addNode(node);
            node.value = value;
        }
        else {
            if (capacity == cache.size()) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.value = value;
            cache.put(key, new_node);
            addNode(new_node);
        }
    }
}