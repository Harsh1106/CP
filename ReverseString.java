import java.util.Stack;
public class ReverseString {
    public static void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s) st.push(ch);
        for(int i = 0 ; i < s.length ; i++){
            s[i] = st.pop();
        }
    }
    public  static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char ch : s) System.out.print(ch);
    }
}
