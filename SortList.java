import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class SortList {
    public static Node sortList(Node head){
        ArrayList<Integer> al = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            al.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(al);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.data = al.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        System.out.print("Original Linked List: ");
        printList(head);

        head = sortList(head);
        System.out.print("Sorted Linked List: ");
        printList(head);
    }
}
