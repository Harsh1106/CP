import java.util.*;
public class majorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int freqOfElement = nums.length/3;
        List<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            int key = entry.getKey();
            if(freq > freqOfElement){
                al.add(key);
            }
            else{
                continue;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
