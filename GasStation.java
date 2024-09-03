public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, fuel = 0, sum = 0;
        for(int i = 0 ; i < gas.length ; i++){
            sum += gas[i] - cost[i];
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                fuel = 0;
                start = i + 1;
            }
        }
        if(sum >= 0)
            return start % (gas.length);
        return -1;
    }
    public static void main(String[] args) {
        int[] gas = {1,2};
        int[] cost = {2,1};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
