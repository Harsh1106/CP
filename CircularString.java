public class CircularString {
    /**
     * Returns true if the given string is a circular string, false otherwise.
     * A circular string is a string where the first and last characters are the same,
     * and all the characters in between are the same.
     * @param s the input string
     * @return true if the string is a circular string, false otherwise.
     * */
    public static boolean circularString(String s){
        if(s.charAt(0) != s.charAt(s.length() - 1)) return false;
        int k = s.indexOf(" ");
        if(k == -1) return false;
        while(k != -1){
            if(s.charAt(k - 1) != s.charAt(k + 1)) return false;

            k = s.indexOf(" ", k + 1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "leetcode exercises sound delightful";
        System.out.println(circularString(s));
    }
}
