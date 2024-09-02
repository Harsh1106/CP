import java.util.*;
public class lengthSubstring{
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        for(int r = 0 ; r < s.length() ; r++){
            if(set.contains(s.charAt(r))){
                while(l < r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}