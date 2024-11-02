public class RotateString{
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String str = s + s;
        return str.contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}