public class countPrime {
    // Use Sieve of Eratosthenes
    public static int countPrimes(int n) {
        if(n <= 2)
            return 0;
        
        boolean[] prime = new boolean[n];
        for(int i = 2 ; i < n ; i++)
            prime[i] = true;
        
        for(int p = 2 ; p * p < n ; p++){
            if(prime[p]){
                for(int i = p * p ; i < n ; i += p)
                    prime[i] = false;
            }
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(prime[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(countPrimes(n));
    }
}
