public class bitwiseAnd {
    public static int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right = right & right - 1;
        }
        return left & right;
    }
    public static void main(String[] args) {
        int left = 5, right = 7;
        System.out.print(rangeBitwiseAnd(left, right));
    }   
}
