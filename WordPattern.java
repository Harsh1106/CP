import java.util.*;
public class WordPattern{
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            String w = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(w)) return false;
            }
            else{
                if(set.contains(w)) return false;
                map.put(c, w);
                set.add(w);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}