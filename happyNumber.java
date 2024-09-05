class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        if(slow == 1)
            return true;
        return false;
    }
    public int square(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
public class happyNumber {
    public static void main(String[] args) {
        int n = 19;
        Solution obj = new Solution();
        System.out.println(obj.isHappy(n));
    }
}
