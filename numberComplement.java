public class numberComplement{
    // best way to solve this question using this approach
    public static int digit(int num){
        int count = 0;
        while(num > 0){
            num = num / 2;
            count++;
        }
        return count;
    }
    public static int findComplement(int num) {
        int n = (int)(Math.pow(2, digit(num)) - 1);
        return n - num;
    }

    // now solving using the string builder concept which is not the worst, it just takes 1ms whereas the above one take 0ms
    public static int findComplementUsingString(int num) {
        StringBuilder str = new StringBuilder();
        int que = num;
        while(que >0){
            str.append(que % 2);
            que /= 2;
        }
        str.reverse();

        StringBuilder complement = new StringBuilder();
        for(char binary : str.toString().toCharArray()){
            complement.append(binary == '0' ? '1' : '0');
        }
        int ans = Integer.parseInt(complement.toString(), 2);
        return ans;
    }
    public static void main(String[] args){
        int num = 5;
        int res = findComplement(num);
        System.out.println(res);
        int string =  findComplementUsingString(num);
        System.out.println(string);
    }
}