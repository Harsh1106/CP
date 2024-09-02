public class studentChalk {
    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int num : chalk){
            sum += num;
        }
        int remainder = (int)(k % sum);
        for(int i = 0 ; i < chalk.length ; i++){
            if(remainder < chalk[i]){
                return i;
            }
            remainder -= chalk[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,5};
        int k = 22;
        System.out.println(chalkReplacer(arr, k));
    }
}
