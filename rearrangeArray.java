class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0;
        int neg = 1;
        for(int num : nums){
            if(num > 0){
                res[pos] = num;
                pos += 2;
            }
            else{
                res[neg] = num;
                neg += 2;
            }
        }
        return res;
    }
}
public class rearrangeArray {
    public static void main(String[] args) {
        int[]  arr = {3,1,-2,-5,2,-4};
        Solution obj =  new Solution();
        int[] res = obj.rearrangeArray(arr);
        for(int num : res){
            System.out.print(num+" ");
        }
    }
}
