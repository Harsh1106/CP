public class MaximumPointsYouCanObtainfromCards{
    public static int maxScore(int[] cardPoints, int k) {
        int lsum =0, rsum =0, max =0,sum =0;
        for(int i=0;i<k;i++){
            lsum = lsum + cardPoints[i];
        }
        max = lsum;
        for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k-1-i];
            rsum += cardPoints[cardPoints.length -1-i];
            sum = lsum+rsum;
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
}