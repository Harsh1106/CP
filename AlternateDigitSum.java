import java.util.Stack;
public class AlternateDigitSum {
    public static int alternateDigitSum(int n) {
        Stack<Integer> st = new Stack<>();
        int res = 0, count = 0;
        while(n > 0){
            st.push(n % 10);
            n /= 10;
        }
        while(!st.isEmpty()){
            int dig = st.pop();
            if(count % 2 == 0)
                res += dig;
            else
                res -= dig;
            count++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 521;
        System.out.println(alternateDigitSum(n));
    }
}
