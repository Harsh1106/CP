public class addString {
    public static String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        StringBuilder str = new StringBuilder();
        int c = 0, base = 10;
        while(p1 >= 0 || p2 >= 0){
            int sum = 0, s1 = 0, s2 = 0;
            if(p1 >= 0)
                s1 = num1.charAt(p1--) - '0';
            if(p2 >= 0)
                s2 = num2.charAt(p2--) - '0';
            sum = s1 + s2 + c;
            if(sum >= base){
                c = 1;
                sum = sum - base;
            }
            else{
                c = 0;
            }
            str.append(sum);
        }
        if(c == 1){
            str.append(c);
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "12";
        String res = addStrings(num1, num2);
        System.out.println("Sum of two strings: "+res);
    }
}
