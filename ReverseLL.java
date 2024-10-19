// Definition for singly-linked list.
import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class ReverseLL {
    public static ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        ListNode reversedHead = reverseList(head);
        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }
}