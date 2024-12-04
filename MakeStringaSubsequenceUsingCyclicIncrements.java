public class MakeStringaSubsequenceUsingCyclicIncrements {
    public static boolean canMakeSubsequence(String str1, String str2) {
        if(str2.length() > str1.length()) return false;
        int idx1 = 0, idx2 = 0;
        while(idx2 < str2.length() && idx1 < str1.length()){
            if(str1.charAt(idx1) == str2.charAt(idx2) || (str1.charAt(idx1) == str2.charAt(idx2) - 1) || str1.charAt(idx1) == 'z' && str2.charAt(idx2) == 'a'){
                idx2++;
            }
            idx1++;
        }
        return (idx2 == str2.length());
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));
    }
}
