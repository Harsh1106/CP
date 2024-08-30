public class numberOfOneBits {
    public static int resolve(String binary){
        int num = 0;
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i) == '1'){
                num++;
            }
        }
        return num;
    }
    public static int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int res = resolve(binary);
        return res;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}
