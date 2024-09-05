import java.util.*;
public class missingObservation {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int len = rolls.length;
        int sum = 0;
        for(int roll : rolls){
            sum += roll;
        }
        int remainingSum = mean * (n + len) - sum;
        if(remainingSum > 6 * n || remainingSum < n){
            return new int[0];
        }
        int distributeMean = remainingSum / n;
        int mod = remainingSum % n;
        int[] ele = new int[n];
        Arrays.fill(ele, distributeMean);
        for(int i = 0 ; i < mod ; i++){
            ele[i]++;
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,3};
        int mean = 4;
        int n = 2;
        int[] res = missingRolls(arr, mean, n);
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
