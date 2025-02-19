import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> al){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(arr[ind] <= target){
            al.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, al); //pick
            al.remove(al.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, al); //reject
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
