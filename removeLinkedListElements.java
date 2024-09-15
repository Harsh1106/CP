class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            if (curr.val == val)
                prev.next = next;
            else
                prev = curr;
            curr = next;
        }
        return dummy.next;
    }
}
public class removeLinkedListElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Print the original list
        System.out.print("Original list: ");
        printList(head);

        // Remove elements with value 6
        Solution solution = new Solution();
        ListNode updatedHead = solution.removeElements(head, 6);

        // Print the updated list
        System.out.print("Updated list: ");
        printList(updatedHead);
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
