public class DeleteCharactersToMakeFancyString{
    public static String makeFancyString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char prev = s.charAt(0);
        for(char ch : s.toCharArray()){
            if(prev == ch){
                count++;
            }
            else{
                count = 1;
            }
            if(count < 3) sb.append(ch);

            prev = ch;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}