import java.util.*;
public class kthFactorOfN {
    public static int kthFactor(int n, int k) {
        List<Integer> al = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0)
                al.add(i);
            else
                continue;
        }
        if(al.size() < k)
            return -1;
        return al.get(k - 1);
    }
    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(kthFactor(n, k));
    }
}
