public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        int start = 0;
        int end = arr.length - 1;
        String temp = "";
        while(start <= end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            temp = "";
        }
        for(String str : arr){
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
}
