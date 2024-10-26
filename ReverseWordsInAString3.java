public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            res.append(sb.reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
