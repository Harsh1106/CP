import java.util.ArrayList;
import java.util.List;

public class seperateDigitsInArray {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : nums){
           List<Integer> temp = new ArrayList<>();
            while (x > 0) {
                temp.add(x % 10);
                x = x/10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                list.add(temp.get(j));
            }
        }
        int [] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] result = separateDigits(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}