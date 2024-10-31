public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int len = s.length();
        int start = 0;
        for(int end = 0 ; end <= len ; end++){
            if(end == len || arr[end] == ' '){
                rev(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }
    public static void rev(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
