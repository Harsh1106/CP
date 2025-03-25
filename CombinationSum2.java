import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    private static void find(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> al){
        if(target == 0){
            ans.add(new ArrayList<> (al));
            return;
        }
        for(int i = ind ; i < arr.length ; i++){
            if(i > ind && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;
            al.add(arr[i]);
            find(i + 1, arr, target - arr[i], ans, al);
            al.remove(al.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        find(0, candidates, target, ans, al);
        return ans;
    }
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }
}
