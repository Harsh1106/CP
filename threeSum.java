import java.util.*;

public class threeSum {
    public static List<List<Integer>> sum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(sum(nums));
    }
}
