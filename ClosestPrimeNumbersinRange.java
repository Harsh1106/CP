import java.util.ArrayList;
import java.util.List;

public class ClosestPrimeNumbersinRange {
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static int[] closestPrimes(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            if(isPrime(i)) al.add(i);
        }
        int first = -1, second = -1, min = Integer.MAX_VALUE;
        for(int i = 0 ; i < al.size() - 1 ; i++){
            int p1 = al.get(i);
            int p2 = al.get(i + 1);
            int diff = p2 - p1;
            if(diff < min){
                min = diff;
                first = p1;
                second = p2;
            }
        }
        return new int[] {first, second};
    }
    public static void main(String[] args) {
        int[] res = closestPrimes(10, 19);
        System.out.println(res[0] + " " + res[1]);
    }
}
