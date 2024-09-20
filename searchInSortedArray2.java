import java.util.*;
public class searchInSortedArray2 {
    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
