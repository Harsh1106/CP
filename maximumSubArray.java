public class maximumSubArray {
    public static int maxCrossingSum(int[] arr, int l, int m, int h) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int j = m + 1; j <= h; j++) {
            sum += arr[j];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return Math.max(leftSum + rightSum, Math.max(leftSum, rightSum));
    }

    public static int maxSubArray(int[] arr, int l, int h) {
        // invalid range
        if (l > h) {
            return Integer.MIN_VALUE;
        }
        // base case: only one element
        if (l == h) {
            return arr[l];
        }

        // find middle point
        int m = (l + h) / 2;

        /*
         * Return maximum of following three cases:
         * a) Maximum subarray sum in left half (l to mid - 1)
         * b) Maximum subarray sum in right half (mid + 1 to h)
         * c) Maximum subarray sum such that the subarray crosses the midpoint - combined sum.
         */
        return Math.max(
                Math.max(maxSubArray(arr, l, m - 1), maxSubArray(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h)
        );
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubArray(arr, 0, n - 1);
        System.out.println("Maximum sum from subarray: " + maxSum);
    }
}
