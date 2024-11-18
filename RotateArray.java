import java.util.LinkedList;
import java.util.Queue;

public class RotateArray {
    static void rotateArr(int arr[], int d) {
        int m = d % arr.length;
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        while(i < m){
            queue.add(arr[i]);
            i++;
        }
        int j = 0;
        while(i < arr.length){
            arr[j] = arr[i];
            i++;
            j++;
        }
        while(!queue.isEmpty()){
            arr[j] = queue.poll();
            j++;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
