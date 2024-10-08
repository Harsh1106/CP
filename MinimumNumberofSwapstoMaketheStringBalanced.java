import java.util.Stack;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    // public static int minSwaps(String s) {
    //     Stack<Character> st = new Stack<>();
    //     for(int i = 0 ; i < s.length() ; i++){
    //         char ch = s.charAt(i);
    //         if(ch == '['){
    //             st.push(ch);
    //         }
    //         else{
    //             if(st.isEmpty() || st.peek() == ']'){
    //                 st.push(ch);
    //             }
    //             else{
    //                 st.pop();
    //             }
    //         }
    //     }
    //     int total = st.size();
    //     int close = total/2;
    //     return (close + 1)/2;
    // }

    // optimized version of previous code.
    public static int minSwaps(String s) {
        int open = 0, close = 0;
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch == '['){
                open++;
            }
            else{
                if(open <= 0){
                    close++;
                }
                else{
                    open--;
                }
            }
        }
        return close/2 + close%2;
    }
    public static void main(String[] args){
        String str = "][][";
        System.out.println(minSwaps(str));
    }
}
