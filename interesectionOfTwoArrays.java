import java.util.ArrayList;
import java.util.HashMap;

public class interesectionOfTwoArrays{
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])){
                if(!al.contains(nums2[i])) al.add(nums2[i]);
            }
        }
        int[] res = new int[al.size()];
        int idx = 0;
        for(int i : al){
            res[idx++] = i;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] res = intersection(nums1, nums2);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}