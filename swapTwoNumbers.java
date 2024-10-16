import java.util.ArrayList;
import java.util.List;
public class swapTwoNumbers{
    public static List<Integer> get(int a,int b)
    {
        List<Integer> al = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        al.add(a);
        al.add(b);
        return al;
    }
    public static void main(String[] args) {
        int a = 13, b = 9;
        System.out.println(get(a, b));
    }
}