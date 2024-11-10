import java.util.*;

public class threeSum {
    public static List<List<Integer>> sum(int[] nums) {
        // Optimal Approach
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    al.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(sum(nums));
    }
}
