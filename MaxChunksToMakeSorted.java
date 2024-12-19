public class MaxChunksToMakeSorted {
    public static int maxChunksToSorted(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max < i + 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        System.out.println(maxChunksToSorted(arr));
    }
}
