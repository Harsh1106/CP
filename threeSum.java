import java.util.*;

public class threeSum {
    public static List<List<Integer>> sum(int[] nums) {
        // Better Approach
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            HashSet<Integer> temp = new HashSet<>();
            for(int j = i + 1 ; j < nums.length ; j++){
                int third = -(nums[i] + nums[j]);
                if(temp.contains(third)){
                    List<Integer> al = Arrays.asList(nums[i], nums[j], third);
                    al.sort(null);
                    st.add(al);
                }
                temp.add(nums[j]);
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
