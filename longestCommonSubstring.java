class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        int res = 0;
        for(int i = 0 ; i < str1.length() ; i++){
            for(int j = i + 1 ; j <= str1.length() ; j++){
                String s = str1.substring(i, j);
                if(str2.contains(s))
                    res = Math.max(res, s.length());
            }
        }
        return res;
    }
}
public class longestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        Solution obj = new Solution();
        int len = obj.longestCommonSubstr(str1, str2);
        System.out.println(len);
    }
}
