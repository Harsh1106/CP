public class MovePiecesToObtainaString {
    public static boolean canChange(String start, String target) {
        if (start.length() != target.length()) return false;
        int i = 0, j = 0;
        int n = start.length();

        while (i < n || j < n) {
            // Skip underscores in 'start'
            while (i < n && start.charAt(i) == '_') 
                i++;
            // Skip underscores in 'target'
            while (j < n && target.charAt(j) == '_') 
                j++;
            
            // If both reach the end, they are valid transformations
            if (i == n || j == n)
                return i == n && j == n;

            // Check if the characters are different
            if (start.charAt(i) != target.charAt(j)) 
                return false;

            // Check movement rules for 'L' and 'R'
            if ((start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j)) 
                return false;

            // Move to the next characters
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start, target));
    }
}
