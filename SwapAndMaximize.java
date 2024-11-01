import java.util.Arrays;

public class SwapAndMaximize {
    public static long maxSum(long[] arr) {
        Arrays.sort(arr);
        long sum = 0;
        int i = 0, j = arr.length - 1;
        while(i < j){
            sum+= (Math.abs(arr[j]-arr[i++]) + Math.abs(arr[j--]-arr[i]));
        }
        sum += Math.abs(arr[i] - arr[0]);
        return sum;
    }
    public static void main(String[] args) {
        long[] arr = {4, 2, 1, 8};
        System.out.println(maxSum(arr));
    }
}
