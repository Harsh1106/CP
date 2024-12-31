import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class DifferenceOfTwoArrays{
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> hm = new HashSet<>();
        HashSet<Integer> hm1 = new HashSet<>();
        for(int num : nums1) hm.add(num);
        for(int num : nums2) hm1.add(num);
        List<Integer> li = new ArrayList<>();
        for(int i : hm){
            if(!hm1.contains(i)) li.add(i);
        }

        list.add(li);
        List<Integer> li1 = new ArrayList<>();
        for(int i : hm1){
            if(!hm.contains(i)) li1.add(i);
        }
        list.add(li1);
        return list;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> list = findDifference(nums1, nums2);
        for(List<Integer> li : list){
            for(int i : li){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}