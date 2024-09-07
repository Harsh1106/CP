public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char ans = 'a';
        for(int i = 0 ; i < s.length() ; i++){
            ans ^= s.charAt(i);
        }
        for(int i = 0 ; i < t.length() ; i++){
            ans ^= t.charAt(i);
        }
        ans ^= 'a';
        return ans;
    }
    public static void main(String[] args){
        String str = "abcd";
        String t = "abcde";
        char res = findTheDifference(str, t);
        System.out.println(res);
    }
}
