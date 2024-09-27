import java.util.HashMap;

public class longestSubStringWithKUniqueChars {
    public static int longestkSubstr(String s, int k) {
        int len = s.length();
        int ans = -1, i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < len){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() > k){
                while(map.size() > k){
                    char ch = s.charAt(i);
                    int freq = map.get(ch);
                    map.put(ch, freq - 1);
                    if(map.get(ch) == 0)
                        map.remove(ch);
                    i++;
                }
            }
            if(map.size() == k){
                int currAns = j - i + 1;
                ans = Math.max(ans, currAns);
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s, k));
    }
}
