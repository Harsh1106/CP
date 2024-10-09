// import java.util.Stack;
public class MinimumAddtoMakeParenthesesValid {
    // public static int minAddToMakeValid(String s) {
    //     Stack<Character> st = new Stack<>();
    //     for(int i = 0 ; i < s.length() ; i++){
    //         char ch = s.charAt(i);
    //         if(ch == '(')
    //             st.push(ch);
    //         else{
    //             if(st.isEmpty() || st.peek() == ')'){
    //                 st.push(ch);
    //             }
    //             else{
    //                 st.pop();
    //             }
    //         }
    //     }
    //     return st.size();
    // }

    public static int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        char[] arr = s.toCharArray();
        for(int ch : arr){
            if(ch == '(')
                open++;
            else{
                if(open <= 0)
                    close++;
                else
                    open--;
            }
        }
        return open + close;
    }
    public static void main(String[] args){
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}
