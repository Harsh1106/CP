import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int res = nums[i] * nums[j];
                map.put(res, map.getOrDefault(res, 0) + 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if(count >= 2) {
                int comb = (count * (count - 1))/2;
                ans = ans + comb * 8;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6};
        System.out.println(tupleSameProduct(arr));
    }
}
