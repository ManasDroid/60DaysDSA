package Day5;

public class ReverseLL {
    public static void main(String[] args) {

    }
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the rest of Linked List
        LinkedListNode<Integer> reverseHead = reverseLinkedList(head.next);
        LinkedListNode<Integer> temp = reverseHead;

        // Find the last node of partial reversed Linked List.
        while (temp.next != null) {
            temp = temp.next;
        }

        // Assign current node next to null.
        head.next = null;

        // Add current node to last of revesed Linked List.
        temp.next = head;

        // Return head of reversed Linked List.
        return reverseHead;
    }
}
