public class sentenceSimilarityThree {
    private static String[] splitWords(String str){
        return str.split(" ");
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = splitWords(sentence1);
        String[] words2 = splitWords(sentence2);
        if(words1.length < words2.length){
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }
        int i = 0, j = 0;
        while(i < words2.length && words1[i].equals(words2[i])){
            i++;
        }
        while(j < words2.length && words1[words1.length - j - 1].equals(words2[words2.length - j - 1])){
            j++;
        }
        return i + j >= words2.length; 
    }
    public static void main(String[] args) {
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
}
