package Day6;

public class CycleDetection {
    public static void main(String[] args) {

    }
    public class Solution {
        class Node {
            public int data;
            public Node next;

            Node()
            {
                this.data = 0;
                this.next = null;
            }

            Node(int data)
            {
                this.data = data;
                this.next = null;
            }

            Node(int data, Node next)
            {
                this.data = data;
                this.next = next;
            }
        }

        public static boolean detectCycle(Node head) {

            if (head == null || head.next == null) {
                return false;
            }

            //  Slow Pointer - This will be incremented by 1 Nodes.
            Node slow = head;
            //  Fast Pointer  - This will be incremented by 2 Nodes.
            Node fast = head.next;

            while (slow != fast) {

                //  We reached the end of the List and haven't found any Cycle.
                if (fast == null || fast.next == null) {
                    return false;
                }

                slow = slow.next;
                fast = fast.next.next;
            }

            //  We found a Cycle.
            return true;

        }
    }
}
