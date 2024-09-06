import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i = 0; i < n ; i++){
            if(!deq.isEmpty() && deq.peek() == i - k){
                deq.poll();
            }
            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i])
                deq.pollLast();
            deq.offer(i);
            if(i >= k - 1){
                arr[ri++] = nums[deq.peek()];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(arr, k);
        for(int num : res){
            System.out.print(num+" ");
        }
    }
}
