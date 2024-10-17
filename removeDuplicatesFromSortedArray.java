public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[count] != nums[i]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
