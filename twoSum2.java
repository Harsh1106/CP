import java.util.HashMap;

public class twoSum2{
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < numbers.length ; i++){
            int x = numbers[i];
            int y = target - x;
            if(map.containsKey(y))
                return new int[] {map.get(y) + 1, i + 1};
            map.put(x,i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(arr, target);
        for(int num : res){
            System.out.print(num+" ");
        }
    }
}