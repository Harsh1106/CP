public class FinalPricesWithaSpecialDiscountinaShop {
    public static int[] finalPrices(int[] prices){
        for(int i = 0 ; i < prices.length ; i++){
            for(int j = i + 1 ; j < prices.length ; j++){
                if(prices[j] <= prices[i]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        int[] res = finalPrices(prices);
        for(int i = 0 ; i < res.length ; i++) System.out.print(res[i]+" ");
    }
}