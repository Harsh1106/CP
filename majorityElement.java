public class majorityElement {
    public static int findMajorityElement(int[] nums) {
        int maj = nums[0], count = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == maj)
                count++;
            else{
                count--;
                if(count == 0){
                    maj = nums[i];
                    count = 1;
                }
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(arr));
    }
}
