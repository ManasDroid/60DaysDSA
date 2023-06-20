package Day5;

public class DeleteNode {
    public static void main(String[] args) {

    }
    public static void deleteNode(LinkedListNode<Integer> node) {
        // Create a temp pointer that initially points to node -> next.
        LinkedListNode<Integer>  temp = (node == null) ? node : (node.next);

        // Store the data of temp as node -> data and make node -> next = temp -> next.
        node . data = temp . data;
        node . next = (temp == null) ? null : (temp . next);

        // Finally delete the temp pointer.
        temp = null;
    }
}
