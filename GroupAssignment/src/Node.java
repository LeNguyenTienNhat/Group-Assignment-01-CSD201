public class Node {
    Phone p_data;
    Node p_next;

    public Node() {
    }

    public Node(Phone info, Node n_data) {
        this.p_data = info;
        this.p_next = n_data;
    }
}
