public class StringtoInteger{
    public static int myAtoi(String s) {
        long res = 0;
        boolean neg = false;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        if(i < s.length() && s.charAt(i) == '-'){
            neg = true;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            if(neg){
                if(res * (-1) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else{
                if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
            i++;
        }
        if(res == 0) return 0;
        return neg ? (int) res * (-1) : (int) res;
    }
    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }
}
