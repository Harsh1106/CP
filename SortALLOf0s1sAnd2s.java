class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SortALLOf0s1sAnd2s {
    public static Node segregate(Node head) {
        if(head == null || head.next == null) return head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead, one = oneHead, two = twoHead;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        Node newHead = zeroHead.next;
        return newHead;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(0);

        System.out.println("Original Linked List:");
        printList(head);

        Node newHead = segregate(head);
        System.out.println("Segregated Linked List:");
        printList(newHead);
    }
}