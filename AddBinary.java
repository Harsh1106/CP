public class AddBinary{
    public static String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int c = 0, base = 2;
        StringBuilder sb = new StringBuilder();
        while(len1 >= 0 || len2 >= 0){
            int t1 = 0, t2 = 0, sum = 0;
            if(len1 >= 0)
                t1 = a.charAt(len1--) - '0';
            if(len2 >= 0)
                t2 = b.charAt(len2--) - '0';
            sum = t1 + t2 + c;
            if(sum >= base){
                c = 1;
                sum = sum - base;
            }
            else{
                c = 0;
            }
            sb.append(sum);
        }
        if(c == 1) sb.append(c);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}