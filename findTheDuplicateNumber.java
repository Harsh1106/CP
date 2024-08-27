import java.util.*;
public class findTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
                return i;
            map.put(i,1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
