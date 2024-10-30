import java.util.HashMap;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        int len = s.length(), indexA = 0, indexB = 0;
        while(indexA < len && indexB < len){
            char chA = s.charAt(indexA);
            int freqA = chA - 97;
            freq[freqA] += 1;

            char chB = t.charAt(indexB);
            int freqB = chB - 97;
            freq[freqB] -= 1;
            indexA++;
            indexB++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
