import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
         for (char c : s.toCharArray()) {
             freq.put(c, freq.getOrDefault(c, 0) + 1);
         }
         PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
         maxHeap.addAll(freq.entrySet());
         StringBuilder result = new StringBuilder();
         while (!maxHeap.isEmpty()) {
             Map.Entry<Character, Integer> entry = maxHeap.poll();
             for (int i = 0; i < entry.getValue(); i++) {
                 result.append(entry.getKey());
             }
         }
         return result.toString();  
     }
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(frequencySort(str));
    }
}
