class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
    // Definition for singly-linked list.
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int c = 0;
        while(t1 != null || t2 != null){
            int s = c;
            if(t1 != null){
                s = s + t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                s = s + t2.val;
                t2 = t2.next;  
            }
            ListNode newNode = new ListNode(s % 10);
            c = s/10;
            curr.next = newNode;
            curr = curr.next;
        }
        if(c > 0){
            ListNode newNode = new ListNode(c);
            curr.next = newNode;
        }
        return dummy.next;
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

        // Create first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println("Linked List 1:");
        printList(l1);
        System.out.println("Linked List 2:");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println("Result:");
        printList(result);
    }
}
