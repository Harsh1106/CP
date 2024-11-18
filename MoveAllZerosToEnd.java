public class MoveAllZerosToEnd {
    static void pushZerosToEnd(int[] arr) {
        int count = 0, n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
