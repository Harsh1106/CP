import java.util.*;
class Solution {
    
    public void Rearrange(int nums[], int n)
    {
        
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < 0){
                negative.add(nums[i]);
            }
            else{
                positive.add(nums[i]);
            }
        }
        
        for(int i = 0 ; i < negative.size() ; i++){
            nums[i] = negative.get(i);
        }
        
        int size = negative.size();
        for(int i = 0 ; i < positive.size() ; i++){
            nums[size] = positive.get(i);
            size++;
            if(size > n)
                break;
        }
    }
}
public class arrangingTheArray{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {-3, 3, -2, 2};
        int n = arr.length;
        obj.Rearrange(arr, n);
        for(int i =  0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}