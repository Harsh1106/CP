import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        for (int[] arr : nums) {
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == n) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5}, {1, 2, 3, 4}, {3,4,5,6}};
        System.out.println(intersection(nums));
    }
}
