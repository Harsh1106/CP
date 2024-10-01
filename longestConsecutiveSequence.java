import java.util.Arrays;
public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int ls = Integer.MIN_VALUE, cnt = 0, longest = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] - 1 == ls){
                cnt++;
                ls = nums[i];
            }
            else if(ls != nums[i]){
                cnt = 1;
                ls = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
