import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {
                al.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        
        int[] res = new int[al.size()];
        int idx = 0;
        for(int num : al){
            res[idx++] = num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersect(nums1, nums2);
        for(int i = 0 ; i < res.length ; i++) System.out.print(res[i]+" ");
    }
}
