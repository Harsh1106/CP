public class FaultyKeyboard {
    public static String finalString(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'i')
                sb.reverse();
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "string";
        System.out.println(finalString(str));
    }
}
