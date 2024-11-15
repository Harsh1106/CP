import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumisLessThanTarget {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0, n = nums.size();
        for(int i = 0 ; i < n ; i++){
            int j = i + 1;
            while(j < n){
                if(nums.get(j) + nums.get(i) < target) count++;
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        System.out.println(countPairs(arr, target));
    }
}
