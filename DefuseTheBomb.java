public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if(k == 0) return arr;
        for(int i = 0 ; i < code.length ; i++){
            int sum = 0;
            for(int j = 1 ; j <= Math.abs(k) ; j++){
                int idx = (k > 0) ? (i + j) % n : (i - j + n) % n;
                sum += code[idx];
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,1,4};
        int k = 3;
        int[] res = decrypt(arr, k);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}
