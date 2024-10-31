public class ReverseString2 {
    public static void rev(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0, n = s.length();
        while(i < n){
            int j = Math.min(i+k-1, n-1);
            rev(arr,i,j);
            i = i + 2*k;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(str,k));
    }
}
