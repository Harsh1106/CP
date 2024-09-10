public class HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int val = 0;
        int temp = x;
        while(x > 0){
            int rem = x % 10;
            val += rem;
            x /= 10;
        }
        return temp % val == 0 ? val : -1;  
    }
    public static void main(String[] args) {
        int n = 18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(n));
    }
}
