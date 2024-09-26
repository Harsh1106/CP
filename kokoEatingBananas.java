import java.util.Arrays;
public class kokoEatingBananas {
    public static int findMax(int[] v){
        int max = Integer.MIN_VALUE;
        Arrays.sort(v);
        max = v[v.length - 1];
        return max;
    }
    public static int totalHrs(int[] arr, int h){
        int total = 0;
        for(int i = 0 ; i < arr.length ; i++){
            total += Math.ceil((double)(arr[i])/(double)(h));
        }
        return total;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);
        while(low <= high){
            int mid = (low + high)/2;
            int total = totalHrs(piles, mid);
            if(total <= h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }
}
