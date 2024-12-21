public class ConstructStringWithRepeatLimit {
    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int idx = 25;
        while(idx >= 0){
            if(freq[idx] == 0){
                idx--;
                continue;
            }

            int used = Math.min(freq[idx], repeatLimit);
            for(int i = 0 ; i < used ; i++){
                sb.append((char)('a' + idx));
            }
            freq[idx] -= used;
            if(freq[idx] > 0){
                int prev = idx - 1;
                while(prev >= 0 && freq[prev] == 0){
                    prev--;
                }
                if(prev < 0) break;
                sb.append((char) ('a' + prev));
                freq[prev]--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimitedString(str, repeatLimit));
    }
}
