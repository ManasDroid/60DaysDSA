package Day5;

public class RemoveKth {
    public static void main(String[] args) {

    }
    public static Node removeKthNode(Node head, int K) {

        if (head == null || K == 0) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < K; i++) {

            // If head is the Kth node from end of Linked List.
            if (fast.next == null) {
                Node next = head.next;
                head.next = null;
                head = next;

                return head;
            } else {
                fast = fast.next;
            }

        }

        // Moving both slow and fast pointer with same speed.
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Removing the Kth node from end of Linked List.
        slow.next = slow.next.next;

        return head;
    }
}
