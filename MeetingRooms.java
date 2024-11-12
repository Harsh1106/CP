import java.util.Arrays;
public class MeetingRooms {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i][1] > arr[i + 1][0]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 4}, {9, 12}, {6, 10}};
        System.out.println(canAttend(arr));     
    }
}
