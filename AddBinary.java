public class AddBinary{
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int idxA = s1.length() - 1, idxB = s2.length() - 1;
        int c = 0;
        while(idxA >= 0 || idxB >= 0 || c > 0){
            if(idxA >= 0){
                c += s1.charAt(idxA--) - '0';
            }
            if(idxB >= 0){
                c += s2.charAt(idxB--) - '0';
            }
            sb.append(c%2);
            c /= 2;
        }
        String s = sb.reverse().toString();
        int one = s.indexOf('1');
        return (one == -1) ? "0" : s.substring(one);
    }
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}