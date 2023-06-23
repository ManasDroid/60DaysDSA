package Day6;

public class ReverseKgroups {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode reverseKGroup(ListNode h, int k) {
            if (h == null || h.next == null || k == 1) {
                return h;
            }
            // a is the current node，b is the next node
            // c is the previous node，d is the first node
            ListNode a = h, b = h.next, c, d = a;
            for (int i = 0; i < k; i++) {
                if (h != null) {
                    h = h.next;
                } else {
                    return a;
                }
            }
            c = h;
            while (b != h) {
                b = a.next;
                a.next = c;
                c = a;
                a = b;
            }
            d.next = reverseKGroup(h, k);
            return c;
        }
    }
}
