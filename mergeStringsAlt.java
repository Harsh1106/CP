public class mergeStringsAlt {
    public static String mergeAlternately(String word1, String word2) {
        int idx = 0;
        String str = "";
        while(idx < word1.length() && idx < word2.length()){
            str += word1.charAt(idx);
            str += word2.charAt(idx);
            idx++;
        }
        if(idx < word1.length()){
            while(idx < word1.length()){
                str += word1.charAt(idx);
                idx++;
            }
        }
        if(idx < word2.length()){
            while(idx < word2.length()){
                str += word2.charAt(idx);
                idx++;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
