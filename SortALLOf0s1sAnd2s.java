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
        Node temp = head;
        int count0 = 0, count1 = 0, count2 = 0;
        while(temp != null){
            if(temp.data == 0) count0++;
            else if(temp.data == 1) count1++;
            else count2++;
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(count0 > 0) {
                temp.data = 0;
                count0--;
            }
            else if(count1 > 0){
                temp.data = 1;
                count1--;
            }
            else{
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
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