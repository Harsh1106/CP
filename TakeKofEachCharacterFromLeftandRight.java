public class TakeKofEachCharacterFromLeftandRight {
    public static int takeCharacters(String s, int k) {
        if(s.length() < k) return -1;
        int n = s.length();
        int[] freq = new int[3];
        int left = 0;
        while(left < n && (freq[0] < k || freq[1] < k || freq[2] < k)){
            freq[s.charAt(left) - 'a']++;
            left++;
        }
        if(freq[0] < k || freq[1] < k || freq[2] < k) return -1;
        int min = left, right = n - 1;
        left -= 1;
        while(left >= 0){
            freq[s.charAt(left) - 'a']--;
            left--;
            while(left <= right && (freq[0] < k || freq[1] < k  || freq[2] < k)){
                freq[s.charAt(right) - 'a']++;
                right--;
            }
            min = Math.min(min, (left + 1) + (n - 1 - right));
        }
        return min;
    }
    public static void main(String[] args) {
        String str = "aabaaaacaabc";
        int k = 2;
        System.out.println(takeCharacters(str, k));
    }
}
