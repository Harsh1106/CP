public class lemonadeChange {
    public static boolean lemonade(int[] bills) {
        int five_count = 0, ten_count = 0;
        for(int bill : bills){
            if(bill == 5){
                five_count++;
            }
            else if(bill == 10){
                if(five_count == 0){
                    return false;   
                }
                five_count--;
                ten_count++;
            }
            else{
                if(five_count > 0 && ten_count > 0){
                    five_count--;
                    ten_count--;
                }
                else if(five_count >= 3){
                    five_count -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bill = {5,5,5,10,20};
        System.out.println(lemonade(bill));
    }
}
