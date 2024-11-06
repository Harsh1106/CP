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
public class RemoveNthNodeFromEndOfLL {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count == n){
            ListNode newNode = head.next;
            return newNode;
        }
        temp = head;
        int len = count - n;
        while(temp != null){
            len--;
            if(len == 0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        head = removeNthFromEnd(head, n);
        printList(head);
    }
}
