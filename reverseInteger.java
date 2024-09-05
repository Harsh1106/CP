public class reverseInteger {
    public static int reverse(int x) {
        int res = 0;
        boolean isNeg = false;
        if(x < 0){
            isNeg = true;
        }
        String str = String.valueOf(Math.abs(x));
        StringBuilder stbr = new StringBuilder(str).reverse();
        try{
            res = Integer.parseInt(stbr.toString());
        }
        catch(Exception e){
            return 0;
        }
        return isNeg ? -res : res;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
