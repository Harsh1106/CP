import java.util.ArrayList;
public class xorOfNumbersWhichAreTwice {
    public static int duplicateNumbersXOR(int[] nums) {
        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i +1 ; j < nums.length ; j++){
                if((nums[i] ^ nums[j]) == 0)
                    al.add(nums[i]);
            }
        }
        for(int i = 0 ; i < al.size() ; i++){
            count ^= al.get(i);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        System.out.println(duplicateNumbersXOR(arr));
    }
}
