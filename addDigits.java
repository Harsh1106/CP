public class addDigits {
    public static int addDigit(int num) {
        if(num < 0)
            return 0;
        int res = 0;
        while(true){
            while(num > 0){
               int rem = num % 10;
               res += rem;
               num /= 10;
            }
            if(res < 10)
                break;
            num = res;
            res = 0;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigit(n));
    }
}
