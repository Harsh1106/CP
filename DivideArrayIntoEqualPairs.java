import java.util.HashSet;

public class DivideArrayIntoEqualPairs {
    public static boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return (set.size()==0);   
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
}
