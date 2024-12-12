import java.util.PriorityQueue;

public class TakeGiftsFromtheRichestPile {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long sum = 0l;
        for(int gift : gifts){
            sum += gift;
            pq.offer(gift);
        }
        for(int i = 0 ; i < k ; i++){
            if(pq.isEmpty()) break;
            int largest = pq.poll();
            int sq = (int)Math.sqrt(largest);
            sum -= (largest - sq);
            pq.offer(sq);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }
}
