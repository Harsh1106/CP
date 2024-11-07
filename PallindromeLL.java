import java.util.ArrayList;
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
class PallindromeLL{
    public static boolean isPallindrome(ListNode head){
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }
        int i = 0, j = al.size() - 1;
        while(i < j){
            if(al.get(i) != al.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPallindrome(head));        
    }
}