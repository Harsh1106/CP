public class SecondLargest{
    public static int getSecondLargest(int[] arr) {
        int first = -1, second = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > first) first = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > second && arr[i] != first) second = arr[i];
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}