import java.util.TreeSet;

public class uglyNumber2 {
    public static int nthUglyNumber(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        Long ugly = 1L;
        for(int i = 0 ; i < n ; i++){
            ugly = set.pollFirst();
            set.add(ugly * 2);
            set.add(ugly * 3);
            set.add(ugly * 5);
        } 
        return ugly.intValue(); //the nth smallest number is the final value of ugly after n iterations.
    }
    public static void main(String[] args) {
        int x = 10;
        int val = nthUglyNumber(x);
        System.out.println(val);
    }
}
